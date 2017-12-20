package com.my.designpatterns.creational.builder;

public class BuilderHouseTest {

	public static void main(String[] args) {
		HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
		ConstructionEngineer concreteEngineer = new ConstructionEngineer(concreteHouseBuilder);
		House concreteHouse = concreteEngineer.constructHouse();
		
		HouseBuilder fabricatedHouseBuilder = new PrefabricatedHouseBuilder();
		ConstructionEngineer fabricatedEngineer = new ConstructionEngineer(fabricatedHouseBuilder);
		House fabricatedHouse = fabricatedEngineer.constructHouse();
	}

}
