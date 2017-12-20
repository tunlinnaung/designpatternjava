package com.my.designpatterns.creational.singleton;

public class SingletonClient {

	public static void main(String[] args) {
		LazyLoader loader1 = LazyLoader.getInstance();
		LazyLoader loader2 = LazyLoader.getInstance();
		if (loader1 == loader2) {
			System.out.println("Two class same");
		}
		else
		{
			System.out.println("Two class difference");
		}
	}

}
