package com.my.designpatterns.creational.singleton;

public class LazyLoader {

	private static LazyLoader lazyClass = null;
	
	private LazyLoader() {
	}
	
	public static LazyLoader getInstance() {
		if (lazyClass == null) {
			return new LazyLoader();
		}
		return lazyClass;
	}
}
