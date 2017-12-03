package com.java.sachin.number.theory;

public class ModularMultiplicativeInverse {

	private static final String METHOD_NORMAL = "Naive Approach";
	private static final String METHOD_FERMIT_LITTLE_THEOREM = "Fermit Little's Theorem";

	public static void main(String[] args) {

		int a = 5, M = 12;
		display(a, M, METHOD_NORMAL, getModularMI(a, M));
		// Only used when M is prime
		M=11;
		display(a, M, METHOD_FERMIT_LITTLE_THEOREM, getModularMIByFLTheorem(a, M));

	}

	private static int getModularMI(int a, int M) {

		for (int b = 1; b < M; b++) {
			if ((a * b) % M == 1) {
				return b;
			}
		}
		return 1;
	}

	private static int getModularMIByFLTheorem(int a, int M) {

		return ModularExponentiation.binaryRecursiveModularPower(a, M - 2, M);
	}

	private static void display(int a, int b, String method, int result) {
		System.out.println(String.format("Modular Multiplicative Inverse  of A: %s with M: %s using %s is : %s", a, b,
				method, result));
	}
}
