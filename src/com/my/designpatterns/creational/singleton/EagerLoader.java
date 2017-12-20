package com.my.designpatterns.creational.singleton;

public class EagerLoader {

	private static final EagerLoader INSTANCE = new EagerLoader();
	
	private EagerLoader() { }
	
	public static EagerLoader getInstance() {
		return INSTANCE;
	}
}
