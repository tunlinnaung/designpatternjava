package com.my.designpatterns.creational.abstractfactory;

// Concrete Product
public class CheesePizza extends Pizza {

	BaseToppingFactory toppingFactory;
	
	public CheesePizza() {
	}
	
	public CheesePizza(BaseToppingFactory toppingFactory) {
		this.toppingFactory = toppingFactory;
	}
	
	@Override
	public void addIngredients() {
		System.out.println("Prepare ingredients for cheese pizza.");
		toppingFactory.createCheese();
		toppingFactory.createSauce();
	}

}
