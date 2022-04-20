package com.ajmicrosystems.trainings;

public class MySingleton {

	private static MySingleton mySingletonInstance;

	private MySingleton() {

	}

	public static MySingleton getSingletonInstance() {

		if (null == mySingletonInstance) {

			mySingletonInstance = new MySingleton();

			System.out.println("new Instance for MySingelton class Created");
		}

		return mySingletonInstance;

	}

	public void printSingleton() {

		System.out.println("Inside printSingleton");
	}

}
