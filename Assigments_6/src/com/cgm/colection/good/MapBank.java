package com.cgm.colection.good;

import java.util.HashMap;
import java.util.Map;

public class MapBank {

	@SuppressWarnings("unlikely-arg-type")
	public void illustrateMap() {

		long startTime = System.currentTimeMillis();
		long startTime2 = System.nanoTime();

		Map<Integer, BankAccount> map = new HashMap<>();

		map.put(new Integer(1), new BankAccount("Alpha Bank", 587.05));
		map.put(new Integer(2), new BankAccount("Beta Bank", 1781.10));

		System.out.println(map.get(1));
		System.out.println(map.get(2));

		// key not found - will return null
		System.out.println(map.get("1"));

		// show map
		interateThroughtMap(map);

		AddMap(map);

		interateThroughtMap(map);

		RemoveMap(map);

		interateThroughtMap(map);

		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		long endTime = System.nanoTime();

		long duration = (endTime - startTime2) / 1000000; // for milliseconds

		System.out.println("Time for Array List is ...... " + duration);

		System.out.println("Time for Map is  " + elapsedTime);
	}

	private void interateThroughtMap(Map<Integer, BankAccount> map) {
		for (Map.Entry<Integer, BankAccount> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " / " + entry.getValue());
		}
	}

	private void AddMap(Map<Integer, BankAccount> map) {
		map.put(new Integer(1), new BankAccount("Alpha Bank ", 587.05));
		map.put(new Integer(2), new BankAccount("Beta Bank", 1781.10));
		map.put(new Integer(3), new BankAccount("Alpha 2 Bank", 587.05));
		map.put(new Integer(4), new BankAccount("Beta 3 Bank", 1781.10));
	}

	private void RemoveMap(Map<Integer, BankAccount> map) {
		map.remove(3);
		System.out.println("Deleted index 3!!!");
	}

	// if lista.Equals(map) return 1 else 0;

}
