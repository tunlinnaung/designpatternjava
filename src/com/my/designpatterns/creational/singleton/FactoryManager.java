package com.my.designpatterns.creational.singleton;

public class FactoryManager {

	private static FactoryManager manager = null;
	
	private FactoryManager() {}
	
	public static FactoryManager getInstance() {
		if (manager == null) {
			return new FactoryManager();
		}
		return manager;
	}
	
	private static int numTracks = 5;
	
	public static void startTracks() {
		for (int i=0;i<numTracks;i++) {
			FactoryManager.Track track = getInstance().new Track();
			track.start();
		}
	}
	
	private class Track extends Thread {

		@Override
		public void run() {
			System.out.println("Running Thread : " + currentThread().getName());;
		}
		
	}
}
