package com.java.sachin.modular.arithmetic;

public class ModularArithmetic {
	private static final String OPERATION_ADD = "addition";
	private static final String OPERATION_SUBTRACT = "subtraction";
	private static final String OPERATION_MULTIPLY = "multiplication";
	private static final String OPERATION_DIVIDE = "division";

	public static void main(String[] args) {
		// Using max available values for addition
		// It will result in a garbage value
		// Assume M=10,000,00
		int a = 2147483647;
		int b = 2147483647;
		final int M = 1000000000;
		int result = (a + b) % M;
		displayNormal(a, b, result, OPERATION_ADD);

		// Lets use the concept of Modulo arithmetic now

		result = (a % M + b % M) % M;
		displayModular(a, b, result, OPERATION_ADD);

		// Using max available values for subtraction
		// It wont produce garbage value this time but we can reduce the big
		// calculations
		a = 2147483647;
		b = 1000000000;

		result = (a - b) % M;
		System.out.println("Result with Subtraction : " + result);

		// Lets use the concept of Modulo arithmetic now

		result = ((a % M) - (b % M) + M) % M;
		System.out.println("Result with Subtraction(Internal modulo) : " + result);

		// Using max available values for multiplication
		// It will result in a garbage value
		
		a = 2000000001;
		b = 2000000005;

		result = (a * b) % M;
		displayNormal(a, b, result, OPERATION_MULTIPLY);

		// Lets use the concept of Modulo arithmetic now

		result = (a % M * b % M) % M;
		displayModular(a, b, result, OPERATION_MULTIPLY);

	}

	private static void displayNormal(int a, int b, int result, String operation) {
		System.out.println(String.format(
				"The result %s is a garbage value because the %s of number a : %s and number b : %s extends MAX integer size : %s in java",
				result, operation, a, b, Integer.MAX_VALUE));
	}

	private static void displayModular(int a, int b, int result, String operation) {
		System.out.println(String.format(
				"The result %s is a correct value now because the %s of number a : %s and number b : %s is carried out after using Modulo",
				result, operation, a, b));
	}
}
