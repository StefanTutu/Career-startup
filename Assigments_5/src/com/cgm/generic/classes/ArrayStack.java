package com.cgm.generic.classes;

import java.lang.reflect.Array;
import java.util.Stack;

import com.cgm.generic.interfaces.Operation;;

public class ArrayStack<T> implements Operation<T> {

	private T[] items;
	private int top; // index of the top item
	private int size;
	Stack<T> stack = new Stack<>();

	@SuppressWarnings("unchecked")
	public ArrayStack(Class<T> item, int size) {
		this.size = size;
		top = -1;
		items = (T[]) Array.newInstance(item, size);
	}

	@Override
	public void add(T item) {
		if (top < size - 1) {
			items[++top] = item;
		}

	}

	@Override
	public T remove() {
		if (isEmpty())
			return null;
		T removed = items[top];
		items[top] = null;
		top--;
		return removed;

	}

	@Override
	public T get() {
		T x = null;
		if (top >= 0) {
			x = items[top--];
		}
		return x;
	}

	@Override
	public boolean isEmpty() {
		return (top == -1);
	}

	@Override
	public boolean isFull() {
		return (top == items.length - 1);
	}

	@Override
	public void list() {
		// System.out.println(stack);

		for (int i = 0; i <= top; i++) {
			System.out.print(items[i] + " ");
		}
		System.out.println();

	}

}
