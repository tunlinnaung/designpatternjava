package com.my.designpatterns.creational.abstractfactory;

public class SiliconPizzaTest {

	public static void main(String[] args) {
		BasePizzaFactory factory = new SiliconPizzaFactory();
		factory.createPizza("cheese");
		System.out.println("");
		factory.createPizza("veggie");
	}

}
