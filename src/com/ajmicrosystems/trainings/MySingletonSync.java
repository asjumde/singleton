package com.ajmicrosystems.trainings;

public class MySingletonSync {
	
	
	private static MySingletonSync mySingletonSyncInstance;

	private MySingletonSync() {

	}

	public static synchronized MySingletonSync getSingletonInstance() {

		if (null == mySingletonSyncInstance) {

			mySingletonSyncInstance = new MySingletonSync();

			System.out.println("new Instance for MySingelton class Created");
		}

		return mySingletonSyncInstance;

	}

	public void printSingleton() {

		System.out.println("Inside printSingleton");
	}

}



