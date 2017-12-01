package com.java.sachin.modular.arithmetic;

public class ModularExponentiation {

	private static final String OPERATION_RECURSIVE_POWER_TYPE = "Normal Recursion power";
	private static final String OPERATION_ITERATIVE_POWER_TYPE = "Normal Iteration power";
	private static final String OPERATION_BINARY_RECURSIVE_POWER_TYPE = "Binary Recursion power";
	private static final String OPERATION_BINARY_ITERATIVE_POWER_TYPE = "Binary Iteration power";

	public static void main(String[] args) {

		int x = 345;
		int n = 20;

		// Just find x*method(x^n-1) recursively .
		int result = recursivePower(x, n);
		displayResult(x, n, result, OPERATION_RECURSIVE_POWER_TYPE);

		// Find x^n by multiplying x with itself n times .
		result = iterativePower(x, n);
		displayResult(x, n, result, OPERATION_ITERATIVE_POWER_TYPE);

		// Find method((x*x)^n/2) with n=n/2 if n is even. else n=(n-1)/2 and
		// find x*method((x*x)^(n-1)/2) recursively .
		result = binaryRecursivePower(x, n);
		displayResult(x, n, result, OPERATION_BINARY_RECURSIVE_POWER_TYPE);

		// Keep multiplying x^2 with x^2 . If n becomes odd, multiply stored
		// result with x .
		result = binaryIterativePower(x, n);
		displayResult(x, n, result, OPERATION_BINARY_ITERATIVE_POWER_TYPE);

	}

	private static int recursivePower(int x, int n) {
		if (n == 0) {
			return 1;
		}
		return x * recursivePower(x, n - 1);
	}

	private static int iterativePower(int x, int n) {
		int result = 1;
		while (n > 0) {
			result = result * x;
			n--;
		}
		return result;
	}

	private static int binaryRecursivePower(int x, int n) {
		if (n == 0) {
			return 1;
		} else if (n % 2 == 0) {
			return recursivePower(x * x, n / 2);
		} else {
			return x * recursivePower(x * x, (n - 1) / 2);
		}

	}

	private static int binaryIterativePower(int x, int n) {

		int result = 1;
		while (n > 0) {
			if (n % 2 == 1) {
				result = result * x;
			}
			x = x * x;
			n = n / 2;
		}
		return result;
	}

	private static void displayResult(int x, int n, int result, String exponentiationType) {
		System.out.println(
				String.format(" %s raise to power %s equals to %s using %s", x, n, result, exponentiationType));
	}
}
