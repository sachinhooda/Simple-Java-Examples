/**
 * 
 */
package com.java.sachin.matrix;

/**
 * @author Sachin Hooda
 *
 */
public class SpiralMatrix {

	public static void main(String[] args) {
		final int n = 4;
		int[][] matrix = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int count = n * n;
		int rowTop = 0;
		int rowBottom = n - 1;
		int columnLeft = 0;
		int columnRight = n - 1;
		while (count > 0) {
		
			for (int i = columnLeft; i <= columnRight; i++) {
				System.out.println(matrix[rowTop][i]);
				count--;
			}
			for (int i = rowTop + 1; i <= rowBottom - 1; i++) {
				System.out.println(matrix[i][columnRight]);
				count--;
			}
			for (int i = columnRight; i >= columnLeft; i--) {
				System.out.println(matrix[rowBottom][i]);
				count--;
			}
			for (int i = rowBottom - 1; i >= rowTop + 1; i--) {
				System.out.println(matrix[i][columnLeft]);
				count--;
			}
			rowTop++;
			rowBottom--;
			columnLeft++;
			columnRight--;
		}
	}
}
