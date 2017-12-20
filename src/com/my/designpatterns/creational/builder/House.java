package com.my.designpatterns.creational.builder;

// Product
public class House {
	private String foundation;
	private String structure;
	private String root;
	private boolean furnished;
	private boolean painted;

	public void setFoundation(String foundation) {
		this.foundation = foundation;
	}

	public void setStructure(String structure) {
		this.structure = structure;
	}

	public void setRoot(String root) {
		this.root = root;
	}

	public void setFurnished(boolean furnished) {
		this.furnished = furnished;
	}

	public void setPainted(boolean painted) {
		this.painted = painted;
	}

}
