package com.my.designpatterns.creational.abstractfactory;

public class SiliconPizzaFactory extends BasePizzaFactory {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza;
		BaseToppingFactory toppingFactory = new SiliconToppingFactgory();
		
		switch (type.toLowerCase()) {
			case "cheese":
				pizza = new CheesePizza(toppingFactory);
				break;
				
			case "pepperoni":
				pizza = new PepperOniPizza(toppingFactory);
				break;
				
			case "veggie":
				pizza = new VeggiePizza(toppingFactory);
				break;
				
			default: throw new IllegalArgumentException("No such pizza");
		}
		
		pizza.addIngredients();
		pizza.bakePizza();
		return pizza;
	}

}
