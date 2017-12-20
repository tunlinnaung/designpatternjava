package com.my.designpatterns.creational.abstractfactory;

public class SiliconToppingFactgory implements BaseToppingFactory {

	@Override
	public Cheese createCheese() {
		return new MozzarelCheese();
	}

	@Override
	public Sauce createSauce() {
		return new TomatoSauce();
	}

}
