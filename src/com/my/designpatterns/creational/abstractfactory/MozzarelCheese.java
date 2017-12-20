package com.my.designpatterns.creational.abstractfactory;

public class MozzarelCheese implements Cheese {

	public MozzarelCheese() {
		prepareCheese();
	}
	
	@Override
	public void prepareCheese() {
		System.out.println("Prepareing mozzarel cheese.");
	}

}
