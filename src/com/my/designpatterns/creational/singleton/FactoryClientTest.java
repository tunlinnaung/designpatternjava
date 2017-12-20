package com.my.designpatterns.creational.singleton;

public class FactoryClientTest {

	public static void main(String[] args) {
		FactoryManager manager = FactoryManager.getInstance();
		manager.startTracks();
	}

}
