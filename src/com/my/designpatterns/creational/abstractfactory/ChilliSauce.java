package com.my.designpatterns.creational.abstractfactory;

public class ChilliSauce implements Sauce {

	public ChilliSauce() {
		prepareSauce();
	}
	
	@Override
	public void prepareSauce() {
		System.out.println("Preparing chilli sauce.");
	}

}
