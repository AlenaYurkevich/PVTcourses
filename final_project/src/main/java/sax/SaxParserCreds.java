package sax;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import emailsMailRu.WrongMailRuCredentialsModel;

public class SaxParserCreds extends DefaultHandler {
	private List<WrongMailRuCredentialsModel> wrongCreds;
	private WrongMailRuCredentialsModel wrongCred;
	boolean bCode = false;
	boolean bName = false;
	boolean bDescription = false;

	public List<WrongMailRuCredentialsModel> getCreds() {
		return wrongCreds;
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

		if (qName.equalsIgnoreCase("LoginData")) {
			String id = attributes.getValue("id");
			wrongCred = new WrongMailRuCredentialsModel();
			wrongCred.setId(Integer.parseInt(id));
			if (wrongCreds == null) {
				wrongCreds = new ArrayList<>();
			}
		} else if (qName.equalsIgnoreCase("Username")) {
			bCode = true;
		} else if (qName.equalsIgnoreCase("Password")) {
			bName = true;
		} 
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equalsIgnoreCase("LoginData")) {
			wrongCreds.add(wrongCred);
		}
	}

	@Override
	public void characters(char ch[], int start, int length) throws SAXException {

		if (bCode) {
			wrongCred.setUsername(new String(ch, start, length));
			bCode = false;
		} else if (bName) {
			wrongCred.setPassword(new String(ch, start, length));
			bName = false;
		} 

	}
}
