/**
 * 
 */
package com.java.sachin.datastructures.heap;

/**
 * @author Sachin Hooda
 *
 */
public class Heap {

	private int[] heapArray;

	private int length;

	private int size;

	boolean isMaxHeap;

	/**
	 * 
	 */
	public Heap(int[] heapArray) {
		this.heapArray = heapArray;
		buildMinHeap();
	}

	/**
	 * 
	 */
	public Heap(int[] heapArray, boolean isMaxHeap) {
		this.heapArray = heapArray;
		this.isMaxHeap = isMaxHeap;
		if (isMaxHeap) {
			buildMaxHeap();
		} else {
			buildMinHeap();
		}
	}

	/**
	 * @return the isMaxHeap
	 */
	public boolean isMaxHeap() {
		return isMaxHeap;
	}

	/**
	 * @return the isMinHeap
	 */
	public boolean isMinHeap() {
		return !isMaxHeap;
	}

	/**
	 * @return the length
	 */
	public int getArrayLength() {
		return length;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @return the top most element i.e. root It could be max element or min element
	 */
	public int getTopElement() {
		return heapArray[1];
	}

	/**
	 * @return the parent
	 */
	private int getParent(int node) {
		return (int) Math.floor(node / 2);
	}

	/**
	 * @return the left child
	 */
	private int getLeftChild(int node) {
		return 2 * node;
	}

	/**
	 * @return the right child
	 */
	private int getRightChild(int node) {
		return (2 * node) + 1;
	}

	private void buildMaxHeap() {
		this.length = heapArray.length;
		this.size = length;
		for(int i=((int) Math.floor(length/2));i>0;i--) {
			maxHeapify(i);
		}
	}

	private void buildMinHeap() {
		// TODO
	}

	private void maxHeapify(int node) {
		// TODO
	}

	private void minHeapify(int node) {
		// TODO
	}
}
