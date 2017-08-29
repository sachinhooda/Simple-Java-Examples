package com.java.sachin.keywords.usage;

public class TestFinalMethodClass {

	public static void main(String args[]) {

		FinalMethodClass finalMethodClass = new FinalMethodChildClass();
		finalMethodClass.display();
		finalMethodClass.anotherDisplay();
		
		FinalMethodClass finalMethodClassParent = new FinalMethodClass();
		finalMethodClassParent.display();
		finalMethodClassParent.anotherDisplay();
		
		FinalMethodChildClass finalMethodChildClass = new FinalMethodChildClass();
		finalMethodChildClass.display();
		finalMethodChildClass.anotherDisplay();
		finalMethodChildClass.anotherDisplayJust();

	}
}
