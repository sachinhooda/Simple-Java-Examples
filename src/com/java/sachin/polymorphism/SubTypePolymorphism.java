package com.java.sachin.polymorphism;

public class SubTypePolymorphism {

	public static void main(String args[]) {
		Animal animal = new Animal();
		Dog dog = new Dog();
		animal.move();
		dog.move();
		Animal animal2 = new Dog();
		animal2.move();
		System.out.println(animal2.getClass());

		try {
			Dog dog2 = (Dog) new Animal();
			dog2.move();
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		}

	}
}
