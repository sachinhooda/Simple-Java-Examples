package com.java.sachin.inheritance;

public class Child extends Father implements Engineer {

	@Override
	public void behaviour() {
		// TODO Auto-generated method stub
		System.out.println("Very Angry");
	}

	@Override
	public void build() {
		// TODO Auto-generated method stub
		System.out.println("Building a Ship");
	}
	
	@Override
	public void treatment() {
		System.out.println("Father's genes working");
	}
}
