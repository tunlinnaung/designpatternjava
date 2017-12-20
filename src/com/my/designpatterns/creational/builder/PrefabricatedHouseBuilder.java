package com.my.designpatterns.creational.builder;

// Concrete Builder
public class PrefabricatedHouseBuilder implements HouseBuilder {
	
	private House house;
	
	public PrefabricatedHouseBuilder() {
		this.house = new House();
	}
	
	@Override
	public void buildFoundation() {
		house.setFoundation("wood, laminate and PVC flooring");
		System.out.println("PrefabricatedHouseBuilder: foundation complete.");
	}

	@Override
	public void buildStructure() {
		house.setStructure("structural steels and wooden wall panels");
		System.out.println("PrefabricatedHouseBuilder: structure complete.");
	}

	@Override
	public void buildRoof() {
		house.setRoot("Roofing sheets");
		System.out.println("PrefabricatedHouseBuilder: roof complete.");
	}

	@Override
	public void furnishHouse() {
		house.setFurnished(true);
		System.out.println("PrefabricatedHouseBuilder: furnishing complete.");
	}

	@Override
	public void paintHouse() {
		house.setPainted(false);
		System.out.println("PrefabricatedHouseBuilder: painting complete.");
	}

	@Override
	public House getHouse() {
		System.out.println("PrefabricatedHouseBuilder: Concrete house complete.");
		return house;
	}

}
