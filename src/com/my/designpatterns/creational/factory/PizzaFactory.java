package com.my.designpatterns.creational.factory;

// Concrete Creator
public class PizzaFactory extends BasePizzaFactory {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza;
		switch (type.toLowerCase()) {
			case "cheese":
				pizza = new CheesePizza();
				break;
				
			case "pepperoni":
				pizza = new PepperOniPizza();
				break;
				
			case "veggie":
				pizza = new VeggiePizza();
				break;
				
			default: throw new IllegalArgumentException("No such pizza");
		}
		
		pizza.addIngredients();
		pizza.bakePizza();
		return pizza;
	}

}
