package com.java.sachin.keywords.usage;

/*
 * Final method of Parent class can not be Inherited here.
 */
public class FinalMethodChildClass extends FinalMethodClass {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("In Child Overriden Display Method");
	}

	public void anotherDisplayJust() {
		System.out.println("In Child Display Method");
	}
}
