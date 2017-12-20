package com.my.designpatterns.creational.prototype;

public class TAndC extends PrototypeCapableDocument {

	@Override
	public PrototypeCapableDocument cloneDocument() throws CloneNotSupportedException {
		TAndC tAndC = null;
		
		try
		{
			tAndC = (TAndC) super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		
		return tAndC;
	}
	
	@Override
	public String toString() {
		return "TADC vendor : " + getVendor() + " - content : " + getContent();
	}

}
