package com.my.designpatterns.creational.builder;

// Builder
public interface HouseBuilder {

	public void buildFoundation();
	public void buildStructure();
	public void buildRoof();
	public void furnishHouse();
	public void paintHouse();
	public House getHouse();
	
}
