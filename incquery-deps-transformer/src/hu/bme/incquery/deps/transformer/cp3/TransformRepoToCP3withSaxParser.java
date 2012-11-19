package hu.bme.incquery.deps.transformer.cp3;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class TransformRepoToCP3withSaxParser {

	public void transform(String fromFile, String toFile) throws Exception {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser = factory.newSAXParser();
		Cp3ModelDetails details = new Cp3ModelDetails(toFile);
		saxParser.parse(new File(fromFile), new Cp3StructureExtractor(details));
		saxParser.parse(new File(fromFile), new Cp3DepsExtractor(details));
		details.write();

	}

	public static void main(String[] args) throws Exception {
		 new TransformRepoToCP3withSaxParser().transform("models/submodel_501.repomodel", "models/submodel_501.cp3model");
//		new TransformRepoToCP3withSaxParser().transform("models/commonbuild-full-pro.repomodel",
//				"models/commonbuild-full-pro.cp3model");
	}
}
