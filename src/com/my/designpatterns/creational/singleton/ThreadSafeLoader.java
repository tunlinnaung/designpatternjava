package com.my.designpatterns.creational.singleton;

public class ThreadSafeLoader {

	private ThreadSafeLoader() { }
	
	private static class ThreadSafeInitiater {
		static final ThreadSafeLoader INSTANCE = new ThreadSafeLoader(); 
	}
	
	public static ThreadSafeLoader getInstance() {
		return ThreadSafeInitiater.INSTANCE;
	}
}
