/**
 * 
 */
package com.sachin.datastructures.tree;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * @author Sachin Hooda
 *
 */
public class Heap<T extends Comparable<T>> {

	private ArrayList<T> items;

	public Heap() {
		items = new ArrayList<T>();
	}

	public void insert(T item) {
		items.add(item);
		siftUp();

	}

	public T delete() throws NoSuchElementException {
		if (items.size() == 0) {
			throw new NoSuchElementException();
		}

		if (items.size() == 1) {
			return items.remove(0);
		}
		T hold = items.get(0);
		items.set(0, items.remove(items.size() - 1));
		siftDown();
		return hold;
	}

	public int size() {

		return items.size();
	}

	public String toString() {
		return items.toString();
	}

	public boolean isEmpty() {
		return items.isEmpty();
	}

	private void siftUp() {
		int k = items.size() - 1;

		while (k > 0) {
			int p = (k - 1) / 2;

			T item = items.get(k);
			T parent = items.get(p);

			if (item.compareTo(parent) > 0) {

				// swap elements
				items.set(k, parent);
				items.set(p, item);
				k = p;
			} else {
				break;
			}

		}
	}

	private void siftDown() {
		int k = 0;
		int l = 2 * k + 1;

		while (l < items.size()) {
			int max = l;
			int r = l + 1;

			if (r < items.size()) {
				if (items.get(r).compareTo(items.get(l)) > 0) {
					max++;
				}
			}

			if (items.get(k).compareTo(items.get(max)) < 0) {
				// swap

				T temp = items.get(k);

				items.set(max, temp);
				items.set(k, items.get(max));

				k = max;
				l = 2 * k + 1;
			} else {
				break;
			}
		}
	}

}
