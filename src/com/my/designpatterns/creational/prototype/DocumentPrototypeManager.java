package com.my.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class DocumentPrototypeManager {

	private static Map<String, PrototypeCapableDocument> map = new HashMap<>();
	
	static {
		TAndC tAndC = new TAndC();
		tAndC.setVendor("Tun Lin");
		tAndC.setContent("Please read Tun Lin terms");
		map.put("tandc", tAndC);
		
		AuthorizeSignature signature = new AuthorizeSignature();
		signature.setName("Steve");
		signature.setDesignation("Apple MD");
		NDAgreement agreement = new NDAgreement();
		agreement.setVendor("Aung");
		agreement.setContent("iOS developer");
		agreement.setSignature(signature);
		map.put("nd", agreement);
	}
	
	public static PrototypeCapableDocument getClonedDocument(final String type) {
		PrototypeCapableDocument clonedDoc = null;
		
		try {
			PrototypeCapableDocument doc = map.get(type);
			clonedDoc = doc.cloneDocument();
		}
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clonedDoc;
	}
}
