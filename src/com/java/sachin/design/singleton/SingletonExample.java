package com.java.sachin.design.singleton;

public class SingletonExample {

	private static final SingletonExample SINGLETON_EXAMPLE = new SingletonExample();

	private SingletonExample() {

	}

	public static SingletonExample getInstance() {
		return SINGLETON_EXAMPLE;
	}

}
