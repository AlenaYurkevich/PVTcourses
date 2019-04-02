package emailsMailRu;

import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLStreamException;
import org.xml.sax.SAXException;

import emailsMailRu.WrongMailRuCredentialsModel;
import sax.SaxParserCreds;


public class ParseCredentials {

	private static final String WRONGMAILRUCREDENTIALS_XML = "wrongMailRuCredentials.xml";

	public static List<WrongMailRuCredentialsModel> getInfo() 
			throws ParserConfigurationException, SAXException, IOException, XMLStreamException {
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		SAXParser saxParser = saxParserFactory.newSAXParser();
		SaxParserCreds saxParserCreds = new SaxParserCreds();
		saxParser.parse(new File(WRONGMAILRUCREDENTIALS_XML), saxParserCreds);
		List<WrongMailRuCredentialsModel> wrongCreds = saxParserCreds.getCreds();
		return wrongCreds;
	}
}
