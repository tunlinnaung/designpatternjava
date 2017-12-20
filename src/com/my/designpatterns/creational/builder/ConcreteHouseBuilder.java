package com.my.designpatterns.creational.builder;

// Concrete Builder
public class ConcreteHouseBuilder implements HouseBuilder {
	
	private House house;
	
	public ConcreteHouseBuilder() {
		this.house = new House();
	}
	
	@Override
	public void buildFoundation() {
		house.setFoundation("concrete, sand, stone");
		System.out.println("ConcreteHouseBuilder: foundation complete.");
	}

	@Override
	public void buildStructure() {
		house.setStructure("concrete, mortar, brick, and reinforced steel");
		System.out.println("ConcreteHouseBuilder: structure complete.");
	}

	@Override
	public void buildRoof() {
		house.setRoot("concrete and reinforced steel");
		System.out.println("ConcreteHouseBuilder: roof complete.");
	}

	@Override
	public void furnishHouse() {
		house.setFurnished(true);
		System.out.println("ConcreteHouseBuilder: furnishing complete.");
	}

	@Override
	public void paintHouse() {
		house.setPainted(true);
		System.out.println("ConcreteHouseBuilder: painting complete.");
	}

	@Override
	public House getHouse() {
		System.out.println("ConcreteHouseBuilder: Concrete house complete.");
		return house;
	}

}
