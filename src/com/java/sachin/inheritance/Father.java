package com.java.sachin.inheritance;

public class Father extends AbstractGrandFather implements Doctor {

	@Override
	public void behaviour() {
		// TODO Auto-generated method stub
		System.out.println("Very Happy");
	}

	@Override
	public void treatment() {
		// TODO Auto-generated method stub
		System.out.println("Treating a Patient");
	}

}
