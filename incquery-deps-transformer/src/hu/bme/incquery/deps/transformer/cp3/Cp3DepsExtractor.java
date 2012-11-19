package hu.bme.incquery.deps.transformer.cp3;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Cp3DepsExtractor extends DefaultHandler{

	private Cp3ModelDetails details;

	public Cp3DepsExtractor(Cp3ModelDetails details) {
		this.details = details;
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if (qName.equals("rDependencies")) {
			String from = attributes.getValue("rFrom");
			String to = attributes.getValue("rTo");
			String type = attributes.getValue("depType");
			
			details.addDependenency(from, to, type);
		}
	}
}
