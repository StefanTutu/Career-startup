package com.cgm.generic.classes;

public class Dictionary<T> {

	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public <U extends Number> void inspect(U u) {
		System.out.println("T: " + obj.getClass().getName());
		System.out.println("U: " + obj.getClass().getName());
	}

}
