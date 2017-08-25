package com.cgm.generic.classes;

public class DictionaryArray <V extends Object> {

	private DictionaryElementArray<String,V>[] dictionary;
	private int length;
	
	@SuppressWarnings("unchecked")
	public DictionaryArray()
	{
		dictionary = new DictionaryElementArray[0];
		length = 0;
	}
	
	@SuppressWarnings("rawtypes")
	public DictionaryElementArray[] getDictionary() {
		return dictionary;
	}


	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void setDictionary(DictionaryElementArray[] dictionary) {
		this.dictionary = dictionary;
	}



	public int getLength() {
		return length;
	}



	public void setLength(int length) {
		this.length = length;
	}


	public boolean isEmpty()
	{
		if(length == 0)
			return true;
		else
			return false;
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})
	public void put(String key, V value)
	{
		DictionaryElementArray<String,V>[] dictionaryAux = new DictionaryElementArray[length];
		System.arraycopy(dictionary, 0, dictionaryAux, 0, length);
		
		length++;
		dictionary = new DictionaryElementArray[length];
		System.arraycopy(dictionaryAux, 0, dictionary, 0, dictionaryAux.length);
		
		dictionary[length-1] = new DictionaryElementArray(key,value);
	}
	
	@SuppressWarnings({"rawtypes"})
	public DictionaryElementArray get(String key)
	{
		DictionaryElementArray<String,V> element = null;
		if(isEmpty())
		{
			System.out.println("Dictionary empty!");
		}
		else
		{
			for(int keyContor = 0; keyContor < length; keyContor++)
			{
				if(dictionary[keyContor].getKey() == key)
				{
					element = dictionary[keyContor];
				}
			}
		}
		
		return element;
	}
	
	@SuppressWarnings("unchecked")
	public void remove(String key)
	{
		for(int keyContor = 0; keyContor < length; keyContor++)
		{
			if(dictionary[keyContor].getKey() == key)
			{
				DictionaryElementArray<String,V>[] dictionaryAux = new DictionaryElementArray[length];
				System.arraycopy(dictionary, 0, dictionaryAux, 0, length);
				
				length--;
				dictionary = new DictionaryElementArray[length];
				System.arraycopy(dictionaryAux, 0, dictionary, 0, length);
			}
		}
	}
	
	public void list()
	{
		System.out.println("Key-Value");
		for(int dictionaryContor = 0; dictionaryContor < length; dictionaryContor++)
		{
			System.out.println(dictionary[dictionaryContor].getKey() + "-" + dictionary[dictionaryContor].getValue());
		}
	}
}
