package hu.bme.incquery.deps.transformer.cp3;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Cp3StructureExtractor extends DefaultHandler {

	private final Cp3ModelDetails details;
	
	String selectedProjectUuid = null;
	String selectedProjectName = null;
	String selectedClassUuid = null;
	String selectedClassName = null;

	public Cp3StructureExtractor(Cp3ModelDetails details) {
		this.details = details;
		
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if (qName.equals("rProjects")) {
			String uuid = attributes.getValue("uuid");
			String name = attributes.getValue("name");
			details.addProject(uuid, name);
			selectedProjectUuid = uuid;
			selectedProjectName= name;
		}
		
		else if (qName.equals("rClasses")) {
			String uuid = attributes.getValue("uuid");
			String name = attributes.getValue("simpleName");
			details.addClass(uuid, name, selectedProjectUuid);
			selectedClassUuid = uuid;
			selectedClassName = name;
		}
		
		else if (qName.equals("rMethods")){
			String uuid = attributes.getValue("uuid");
			String name = attributes.getValue("signature");
			name = name.split("\\#")[1].split("\\(")[0];
			if (name.startsWith("<")){
				name = name.replace("<", "&lt;").replace(">", "&gt;");
			}
			details.addMethod(uuid, selectedClassName + "#" + name, selectedClassUuid);
		}
		
		else if (qName.equals("rFields")){
			String uuid = attributes.getValue("uuid");
			String name = attributes.getValue("signature");
			String[] names = name.split("\\.");
			name = names[names.length-1];
			
			details.addField(uuid, selectedClassName + "#" + name, selectedClassUuid);
		}
	}
}
