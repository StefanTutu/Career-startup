package com.cgm.colection.classes;

import java.util.HashMap;
import java.util.Map;


public class MapTransaction {
	
	@SuppressWarnings("unlikely-arg-type")
	public void illustrateMap(){
		Map<Integer, Transaction> map = new HashMap<>();

		map.put(new Integer(1), new Transaction("Bank1", null, 1000.00));
		map.put(new Integer(2), new Transaction("Bank2", null, 2000.00));
		
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		
		// key not found - will return null
		System.out.println(map.get("1"));
		System.out.println(map.get("2"));
		
		// show map
		interateThroughtMap(map);
	}
	
	private void interateThroughtMap(Map<Integer, Transaction> map){
		for (Map.Entry<Integer, Transaction> entry : map.entrySet())
		{
		    System.out.println(entry.getKey() + " / " + entry.getValue());
		}
	}

}
