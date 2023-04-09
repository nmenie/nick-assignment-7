package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	private int size = 0;

	@Override
	public boolean add(T item) {
		if (size == items.length) {
			items = Arrays.copyOf(items, items.length * 2);

		}
		items[size++] = item;

		return true;
	}

	@Override
	public int getSize() {

		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {

		return (T) items[index];

	}

	@Override
	public boolean add(int index, T item) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index is out of bounds! " + index);
		}

		for (int i = size; i >= index; i--) {
			items[i + 1] = items[i];
		}

		items[index] = item;
		size++;

		return true;
	}

	@SuppressWarnings("unchecked")
	public T remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index is out of bounds! " + index);

		}

		T removeItem = (T) items[index];

		for (int i = index; i < size - 1; i++) {

			items[i] = items[i + 1];
		}

		items[size - 1] = null;
		

		return removeItem;
	}

}

