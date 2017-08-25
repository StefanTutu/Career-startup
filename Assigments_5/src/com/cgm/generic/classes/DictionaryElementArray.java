package com.cgm.generic.classes;

public class DictionaryElementArray <K extends Object,V extends Object> {

	private K key;
	private V value;
	
	public DictionaryElementArray()
	{
		
	}
	
	public DictionaryElementArray(K key, V value)
	{
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
}
