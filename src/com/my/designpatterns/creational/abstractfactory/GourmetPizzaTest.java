package com.my.designpatterns.creational.abstractfactory;

public class GourmetPizzaTest {

	public static void main(String[] args) {
		BasePizzaFactory factory = new GourmetPizzaFactory();
		factory.createPizza("cheese");
		factory.createPizza("veggie");
	}

}
