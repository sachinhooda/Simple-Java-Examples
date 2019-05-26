/**
 * 
 */
package com.sachin.datastructures.tree;

import java.util.Scanner;

/**
 * @author Sachin Hooda
 *
 */
public class HeapApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Heap<Integer> hp = new Heap<Integer>();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter next int, 'done' to stop: ");
		String line = scanner.next();

		while (!line.equals("done")) {

			hp.insert(Integer.parseInt(line));
			System.out.println(hp);
			System.out.println("Enter next int, 'done' to stop: ");
			line = scanner.next();
		}

		while (!hp.isEmpty()) {
			int max = hp.delete();
			System.out.println(max + " " + hp);
		}
		scanner.close();
	}

}
