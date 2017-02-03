package com.java.sachin.sorting;

/**
 * @author Sachin Hooda
 *
 */
public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String args[]) {

		int[] unsortedArray = { 34, 25, 245, 321, 67, 45, 5, 168, 23, 15 };
		int arrayLength = unsortedArray.length;

		int key = 0;
		int j = 0;

		// Loop Invariant is the sorted array[0..... i-1]
		// It will be true for all iterations
		// After the Loop terminates Loop Invariant gives us the sorted array
		// and shows that the
		// algorithm Insertion sort is correct
		for (int i = 1; i < arrayLength; i++) {
			key = unsortedArray[i];
			j = i - 1;
			while (j > -1 && unsortedArray[j] > key) {
				unsortedArray[j + 1] = unsortedArray[j];
				j = j - 1;
			}
			unsortedArray[j + 1] = key;
		}

		for (int k = 0; k < arrayLength; k++) {
			System.out.println(unsortedArray[k]);
		}
	}
}
