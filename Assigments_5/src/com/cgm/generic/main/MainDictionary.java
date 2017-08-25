package com.cgm.generic.main;

import java.util.ArrayList;
import java.util.List;
import com.cgm.generic.classes.Dictionary;
import com.cgm.generic.classes.OrderedPair;
import com.cgm.generic.interfaces.Pair;

public class MainDictionary {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		List<Dictionary<String>> lists = new ArrayList<>();

		Dictionary<String> list = new Dictionary<>();
		list.setObj("a String");
		Dictionary<String> list2 = new Dictionary<>();
		list2.setObj("Another string");

		lists.add(list);
		lists.add(list2);

		list.inspect(123);

		// using pairs
		Pair<String, String> p1 = new OrderedPair<>("aKey", "aValue");
		Pair<Integer, String> p2 = new OrderedPair<>(123, "aValue");

		List<OrderedPair<String, Integer>> listOrder = new ArrayList<OrderedPair<String, Integer>>();
		listOrder.add(new OrderedPair<String, Integer>("String 1", 1));
		listOrder.add(new OrderedPair<String, Integer>("String 2", 2));
		listOrder.add(new OrderedPair<String, Integer>("String 3", 3));
		listOrder.add(new OrderedPair<String, Integer>("String 4", 4));
		listOrder.add(new OrderedPair<String, Integer>("String 5", 5));

		for (OrderedPair dictionar : listOrder) {
			System.out.println("Key  " + dictionar.getKey() + " Value " + dictionar.getValue());
		}

	}

}
