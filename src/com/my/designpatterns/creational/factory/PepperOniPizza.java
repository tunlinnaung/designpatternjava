package com.my.designpatterns.creational.factory;

// Concrete Product
public class PepperOniPizza extends Pizza {

	@Override
	public void addIngredients() {
		System.out.println("Prepare ingredients for pepper oni pizza.");
	}
	
}
