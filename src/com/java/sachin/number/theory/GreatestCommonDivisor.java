package com.java.sachin.number.theory;

public class GreatestCommonDivisor {

	private static final String METHOD_NORMAL = "Normal Method";
	private static final String METHOD_EUCLID = "Euclid's Method";

	public static void main(String[] args) {

		int a = 125, b = 100;
		display(a, b, METHOD_NORMAL, getByNormalGCD(a, b));

		a = 33;
		b = 11;
		display(a, b, METHOD_EUCLID, getByEuclidGCD(a, b));

	}

	// Naive approach
	private static int getByNormalGCD(int a, int b) {

		for (int i = Math.min(a, b); i > 0; --i) {
			if ((a % i == 0) && (b % i == 0)) {

				return i;
			}
		}
		return 1;
	}

	// Euclid's approach
	private static int getByEuclidGCD(int a, int b) {

		if (b == 0) {
			return a;
		} else {
			return getByEuclidGCD(b, a % b);
		}

	}

	private static void display(int a, int b, String method, int gcd) {
		System.out.println(String.format("Greatest Common Divisor of %s and %s by %s is : %s", a, b, method, gcd));
	}

}
