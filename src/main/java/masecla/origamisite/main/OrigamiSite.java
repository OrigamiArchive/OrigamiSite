package masecla.origamisite.main;

import java.io.IOException;

import masecla.mamp.classes.MAMPEngine;
import masecla.mamp.classes.Request;
import masecla.mamp.classes.UserClient;
import masecla.mamp.classes.Webpage;
import masecla.mamp.classes.Website;

public class OrigamiSite {
	public static void main(String[] args) throws IOException {
		Website wb = new Website();

		wb.map("/", new Webpage() {

			@Override
			public String generateHTML(Website wb, UserClient client, MAMPEngine engine, Request request) {
				return "Hello";
			}
		});

		wb.open();
	}
}
