package com.my.designpatterns.creational.prototype;

public class PrototypeClientTest {

	public static void main(String[] args) {
		PrototypeCapableDocument dc1 = DocumentPrototypeManager.getClonedDocument("tandc");
		dc1.setVendor("Java");
		System.out.println(dc1);
		
		PrototypeCapableDocument dc2 = DocumentPrototypeManager.getClonedDocument("nd");
		dc2.setVendor("C#");
		System.out.println(dc2);
	}

}
