package com.my.designpatterns.creational.factory;

// Concrete product
public class VeggiePizza extends Pizza {

	@Override
	public void addIngredients() {
		System.out.println("Preparing ingredients for Veggie pizza.");
	}

}
