package com.my.designpatterns.creational.builder;

// Director
public class ConstructionEngineer {

	HouseBuilder houseBuilder;
	
	public ConstructionEngineer(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	
	public House constructHouse() {
		houseBuilder.buildFoundation();
		houseBuilder.buildStructure();
		houseBuilder.buildRoof();
		houseBuilder.furnishHouse();
		houseBuilder.paintHouse();
		return houseBuilder.getHouse();
	}
}
