package hu.bme.incquery.deps.transformer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class TransformRepoToCP1withSaxParser {

	class MyHandler extends DefaultHandler {

		private BufferedWriter writer;
		private Map<String, Long> uuidToId = new HashMap<String, Long>();
		private long id = 0l;

		private long nextId() {
			return ++id;
		}

		public MyHandler(String file) throws IOException {
			writer = new BufferedWriter(new FileWriter(new File(file)));
		}

		@Override
		public void startDocument() throws SAXException {
			try {
				writer.write("<?xml version=\"1.0\" encoding=\"ASCII\"?>"
						+ "<cp1:CP1Repository xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:cp1=\"http://inf.mit.bme.hu/donat/incquery-deps/cp1model\">\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

			try {
				if (qName.equals("rDependencies")) {
					String rFrom = attributes.getValue("rFrom");
					String rTo = attributes.getValue("rTo");
					String depType = attributes.getValue("depType");

					Long fromId = uuidToId.get(rFrom);
					if (fromId == null) {
						uuidToId.put(rFrom, fromId = nextId());
					}

					Long toId = uuidToId.get(rTo);
					if (toId == null) {
						uuidToId.put(rTo, toId = nextId());
					}

					writer.write(String.format("  <dependencies from=\"%s\" to=\"%s\" type=\"%s\"/>\n", fromId, toId,
							depType));

				}

				else if (qName.equals("rProjects")) {
					String name = attributes.getValue("name");
					writer.write(String.format("  <projects id=\"%d\" name=\"%s\">\n", nextId(), name));
				} else if (qName.equals("rClasses")) {

					String uuid = attributes.getValue("uuid");
					Long id = uuidToId.get(uuid);
					if (id == null) {
						uuidToId.put(uuid, id = nextId());
					}

					String extendz = attributes.getValue("extends");
					String implementz = attributes.getValue("implements");
					String packageName = attributes.getValue("packageName");
					String simpleName = attributes.getValue("simpleName");

					writer.write(String
							.format("    <classes id=\"%d\" extends=\"%s\" implements=\"%s\" simpleName=\"%s\" packageName=\"%s\">\n",
									id, extendz, implementz, simpleName, packageName));
				} else if (qName.equals("rMethods")) {
					String uuid = attributes.getValue("uuid");
					Long id = uuidToId.get(uuid);
					if (id == null) {
						uuidToId.put(uuid, id = nextId());
					}

					String signature = attributes.getValue("signature").replace("<", "&lt;");
					writer.write(String.format("      <methods id=\"%d\" signature=\"%s\">\n", id, signature));

				} else if (qName.equals("rFields")) {
					String uuid = attributes.getValue("uuid");
					Long id = uuidToId.get(uuid);
					if (id == null) {
						uuidToId.put(uuid, id = nextId());
					}

					String signature = attributes.getValue("signature");
					writer.write(String.format("      <fields id=\"%d\" signature=\"%s\">\n", id, signature));

				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void endElement(String uri, String localName, String qName) throws SAXException {
			try {
				if (qName.equals("rProjects")) {
					writer.write("  </projects>\n");
				} else if (qName.equals("rClasses")) {
					writer.write("    </classes>\n");
				} else if (qName.equals("rMethods")) {
					writer.write("      </methods>\n");
				} else if (qName.equals("rFields")) {
					writer.write("      </fields>\n");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void endDocument() throws SAXException {
			try {
				writer.write("</cp1:CP1Repository>");
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void transform(String from, String to) throws Exception {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser = factory.newSAXParser();

		saxParser.parse(new File(from), getHandler(to));
	}

	private DefaultHandler getHandler(String forFile) throws IOException {
		return new MyHandler(forFile);
	}

	public static void main(String[] args) throws Exception {
		new TransformRepoToCP1withSaxParser().transform("models/commonbuild-full-pro.repomodel",
				"models/commonbuild-full-pro.cp1model");
	}
}
