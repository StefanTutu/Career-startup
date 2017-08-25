package com.cgm.generic.interfaces;

public interface Operation<T> {

	void add(T item);

	T remove();

	T get();

	boolean isEmpty();

	boolean isFull();

	public void list();

}
