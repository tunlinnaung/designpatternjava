package com.my.designpatterns.creational.abstractfactory;

import org.junit.Test;

public class PizzaFactoryTest {

	@Test
	public static void main(String[] args) {
		BasePizzaFactory pizzaFactory = new PizzaFactory();
		pizzaFactory.createPizza("cheese");
		pizzaFactory.createPizza("pepperoni");
	}

}
