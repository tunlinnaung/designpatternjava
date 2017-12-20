package com.my.designpatterns.creational.factory;

// Concrete Product
public class CheesePizza extends Pizza {

	@Override
	public void addIngredients() {
		System.out.println("Prepare ingredients for cheese pizza.");		
	}

}
