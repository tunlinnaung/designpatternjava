package com.my.designpatterns.creational.abstractfactory;

public class GourmetToppingFactory implements BaseToppingFactory {

	@Override
	public Cheese createCheese() {
		return new GoatCheese();
	}

	@Override
	public Sauce createSauce() {
		return new ChilliSauce();
	}

}
