package com.my.designpatterns.creational.prototype;

// Product
public abstract class PrototypeCapableDocument implements Cloneable {

	private String vendor;
	private String content;

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public abstract PrototypeCapableDocument cloneDocument() throws CloneNotSupportedException;
}
