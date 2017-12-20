package com.my.designpatterns.creational.abstractfactory;

// Concrete Product
public class PepperOniPizza extends Pizza {

	BaseToppingFactory toppingFactory;
	
	public PepperOniPizza() {
	}
	
	public PepperOniPizza(BaseToppingFactory toppingFactory) {
		this.toppingFactory = toppingFactory;
	}
	
	@Override
	public void addIngredients() {
		System.out.println("Prepare ingredients for pepper oni pizza.");
		toppingFactory.createCheese();
		toppingFactory.createSauce();
	}
	
}
