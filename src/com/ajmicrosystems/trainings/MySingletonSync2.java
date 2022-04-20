package com.ajmicrosystems.trainings;

public class MySingletonSync2 {

	private static MySingletonSync2 mySingletonSync2Instance;

	private MySingletonSync2() {

	}

	public static MySingletonSync2 getSingletonInstance() {

		if (null == mySingletonSync2Instance) {

			{
				synchronized (MySingletonSync2.class)

				{

					if (null == mySingletonSync2Instance)

					{

						mySingletonSync2Instance = new MySingletonSync2();

					}
				}
			}

		}
		return mySingletonSync2Instance;

	}

	public void printSingleton() {

		System.out.println("Inside printSingleton");
	}

}
