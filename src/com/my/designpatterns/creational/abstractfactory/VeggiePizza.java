package com.my.designpatterns.creational.abstractfactory;

// Concrete product
public class VeggiePizza extends Pizza {

	BaseToppingFactory toppingFactory;
	
	public VeggiePizza() {
	}
	
	public VeggiePizza(BaseToppingFactory toppingFactory) {
		this.toppingFactory = toppingFactory;
	}

	@Override
	public void addIngredients() {
		System.out.println("Preparing ingredients for Veggie pizza.");
		toppingFactory.createCheese();
		toppingFactory.createSauce();
	}

}
