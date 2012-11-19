package hu.bme.incquery.deps.transformer.cp3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Cp3ModelDetails {

	private static long id;

	private static long nextId() {
		return ++id;
	}

	private static void addToMap(HashMap<Long, Set<Long>> map, Long key, Long value) {
		Set<Long> list = map.get(key);
		if (list == null) {
			list = new HashSet<Long>();
			map.put(key, list);
		}
		list.add(value);
	}

	private String listToString(Collection<?> elems) {
		if (elems == null) {
			return "";
		}
		StringBuffer result = new StringBuffer();
		for (Object o : elems) {
			result.append(o.toString());
			result.append(" ");
		}
		return result.toString().trim();
	}

	private HashMap<String, String> projectUuidToName = new HashMap<String, String>();
	private HashMap<String, Long> projectUuidToId = new HashMap<String, Long>();

	private HashMap<String, Long> codeElementUuidToId = new HashMap<String, Long>();

	private HashMap<Long, Set<Long>> projectIdToClassIds = new HashMap<Long, Set<Long>>();
	private HashMap<Long, Set<Long>> classIdToProjectIds = new HashMap<Long, Set<Long>>();
	private HashMap<Long, Set<Long>> classIdToFieldIds = new HashMap<Long, Set<Long>>();
	private HashMap<Long, Set<Long>> fieldIdToClassIds = new HashMap<Long, Set<Long>>();
	private HashMap<Long, Set<Long>> classIdToMethodIds = new HashMap<Long, Set<Long>>();
	private HashMap<Long, Set<Long>> methodIdToClassIds = new HashMap<Long, Set<Long>>();

	private HashMap<String, Long> classNameToId = new HashMap<String, Long>();
	private HashMap<Long, String> classIdToName = new HashMap<Long, String>();

	private HashMap<String, Long> fieldNameToId = new HashMap<String, Long>();
	private HashMap<Long, String> fieldIdToName = new HashMap<Long, String>();

	private HashMap<String, Long> methodNameToId = new HashMap<String, Long>();
	private HashMap<Long, String> methodIdToName = new HashMap<Long, String>();

	
	private Set<Triplet<Long, Long, String>> deps = new HashSet<Triplet<Long,Long,String>>();
	private String toFile;
	
	

	public Cp3ModelDetails(String toFile) {
		this.toFile = toFile;
	}

	public void addProject(String uuid, String name) {
		projectUuidToName.put(uuid, name);
		projectUuidToId.put(uuid, nextId());
	}

	public void addClass(String uuid, String name, String selectedProjectUuid) {
		Long classId = classNameToId.get(name);
		if (classId == null) {
			classId = nextId();
			classNameToId.put(name, classId);
			classIdToName.put(classId, name);
		}

		Long selectedProjectId = projectUuidToId.get(selectedProjectUuid);
		addToMap(projectIdToClassIds, selectedProjectId, classId);
		addToMap(classIdToProjectIds, classId, selectedProjectId);

		codeElementUuidToId.put(uuid, classId);
	}

	public void addField(String uuid, String name, String selectedClassUuid) {
		Long fieldId = fieldNameToId.get(name);
		if (fieldId == null) {
			fieldId = nextId();
			fieldNameToId.put(name, fieldId);
			fieldIdToName.put(fieldId, name);
		}

		Long selectedClassId = codeElementUuidToId.get(selectedClassUuid);
		addToMap(fieldIdToClassIds, fieldId, selectedClassId);
		addToMap(classIdToFieldIds, selectedClassId, fieldId);

		codeElementUuidToId.put(uuid, fieldId);

	}

	public void addMethod(String uuid, String name, String selectedClassUuid) {
		Long methodId = methodNameToId.get(name);
		if (methodId == null) {
			methodId = nextId();
			methodNameToId.put(name, methodId);
			methodIdToName.put(methodId, name);
		}

		Long selectedClassId = codeElementUuidToId.get(selectedClassUuid);
		addToMap(methodIdToClassIds, methodId, selectedClassId);
		addToMap(classIdToMethodIds, selectedClassId, methodId);

		codeElementUuidToId.put(uuid, methodId);
	}
	
	public void addDependenency(String from, String to, String type) {
		Long fromId = codeElementUuidToId.get(from);
		Long toId = codeElementUuidToId.get(to);
		deps.add(new Triplet<Long, Long, String>(fromId, toId, type));
	}
	
	
	public void write() throws IOException {
		System.err.println("Start writing");

		BufferedWriter writer = new BufferedWriter(new FileWriter(new File(toFile)));

		writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
		writer.write("<cp3:CP3Repo xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:cp3=\"http://inf.mit.bme.hu/donat/incquery-deps/cp3model\">\n");

		// Add projects
		for (String projectUuid : projectUuidToName.keySet()) {
			String projectName = projectUuidToName.get(projectUuid);
			Long projectId = projectUuidToId.get(projectUuid);

			writer.write(String.format("<items xsi:type=\"cp3:CP3Project\" id=\"%s\" name=\"%s\" classes=\"%s\"/>\n",
					projectId, projectName, listToString(projectIdToClassIds.get(projectId))));
		}

		// Add classes
		for (Long classId : classIdToName.keySet()) {
			String className = classIdToName.get(classId);
			writer.write(String
					.format("<items xsi:type=\"cp3:CP3Class\" id=\"%s\" name=\"%s\" projects=\"%s\" methods=\"%s\" fields=\"%s\"/>\n",
							classId, className, listToString(classIdToProjectIds.get(classId)),
							listToString(classIdToMethodIds.get(classId)), listToString(classIdToFieldIds.get(classId))));
		}

		// Add methods
		for (Long methodId : methodIdToName.keySet()) {
			String methodName = methodIdToName.get(methodId);
			writer.write(String.format("<items xsi:type=\"cp3:CP3Method\" id=\"%s\" name=\"%s\" classes=\"%s\" />\n",
					methodId, methodName.split("\\#")[1], listToString(methodIdToClassIds.get(methodId))));
		}

		// Add fields
		for (Long fieldId : fieldIdToName.keySet()) {
			String fieldName = fieldIdToName.get(fieldId);
			writer.write(String.format("<items xsi:type=\"cp3:CP3Field\" id=\"%s\" name=\"%s\" classes=\"%s\" />\n",
					fieldId, fieldName.split("\\#")[1], listToString(fieldIdToClassIds.get(fieldId))));
		}
		
		// Add dependencies
		for (Triplet<Long, Long, String> dep : deps) {
			writer.write(String.format("<deps type=\"%s\" from=\"%s\" to=\"%s\"/>\n", dep.getC(), dep.getA(), dep.getB()));
			
		}

		writer.write("</cp3:CP3Repo>\n");
		writer.flush();
		writer.close();
	}

}
