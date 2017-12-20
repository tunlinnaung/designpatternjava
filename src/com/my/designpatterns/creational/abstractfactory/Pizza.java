package com.my.designpatterns.creational.abstractfactory;

// Product
public abstract class Pizza {
	public abstract void addIngredients();
	
	public void bakePizza() {
		System.out.println("Pizza make by 20 ingredients by 4 minutes.");
	}
}
