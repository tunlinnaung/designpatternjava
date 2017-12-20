package com.my.designpatterns.creational.singleton;

public class LazyThreadSafeLoader {

	private static LazyThreadSafeLoader threadSafeClass = null;
	
	private LazyThreadSafeLoader() { }
	
	public static synchronized LazyThreadSafeLoader getInstance() {
		if (threadSafeClass == null) {
			return new LazyThreadSafeLoader();
		}
		
		return threadSafeClass;
	}
}
