package com.java.sachin.sorting;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Sachin Hooda
 *
 */
public class MergeSort {

	private Logger logger = Logger.getLogger("MergeSort.class");
	private int[] array;
	private int[] tempArray;
	int length;

	public static void main(String args[]) {

		int[] unsortedArray = { 23, 12, 234, 789, 345, 55, 68, 43, 199, 233 };
		MergeSort mergeSorter = new MergeSort();
		mergeSorter.array = unsortedArray;
		mergeSorter.length = unsortedArray.length;
		mergeSorter.tempArray = new int[mergeSorter.length];

		mergeSorter.mergeSort(0, mergeSorter.length - 1);
		mergeSorter.display(mergeSorter.array, 0, 9);

	}

	private void mergeSort(int p, int r) {

		if (p < r) {
			int q = (p + r) / 2;
			mergeSort(p, q);
			mergeSort(q + 1, r);
			merge(p, q, r);
		}

	}

	private void merge(int p, int q, int r) {

		int indexArray1 = q - p + 1;
		int indexArray2 = r - q;
		int[] leftArray = new int[indexArray1+1];
		int[] rightArray = new int[indexArray2+1];

		for (int i = 0; i < indexArray1; i++) {
			leftArray[i] = array[p + i];
		}
		for (int j = 0; j < indexArray2; j++) {
			rightArray[j] = array[q + j + 1];
		}
		
		leftArray[indexArray1]=Integer.MAX_VALUE;
		rightArray[indexArray2]=Integer.MAX_VALUE;

		int i = 0;
		int j = 0;
		int k=0;
		try {
			for(k=p;k<=r;k++) {
				if (leftArray[i] <= rightArray[j]) {
					array[k] = leftArray[i];
					i++;
				} else {
					array[k] = rightArray[j];
					j++;

				}
				
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			logger.log(Level.INFO, e.toString());
		}

	}

	private void display(int[] sortedArray, int p, int r) {

		for (int i = p; i <= r; i++) {
			System.out.println(sortedArray[i]);
		}
	}
}
