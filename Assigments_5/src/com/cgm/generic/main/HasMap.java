package com.cgm.generic.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HasMap {

	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) {

		HashMap<String, Integer> keyValue = new HashMap<String, Integer>();

		// create hashmap with keys and values (CompanyName, #Employees)
		keyValue.put("string", 123);
		keyValue.put("string1", 232);
		keyValue.put("string2", 62);
		keyValue.put("string3", 123);
		keyValue.put("string4", 321);

		HashMap<String, String> keysValue = new HashMap<String, String>();

		// System.out.println(" Size of list key Value: " + keyValue.size());
		Iterator it = keyValue.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pairs = (Map.Entry) it.next();
			System.out.println(pairs.getKey() + " = " + pairs.getValue());
		}

		// Converting HashMap keys into ArrayList
		List<String> keyList = new ArrayList<String>(keyValue.keySet());
		// System.out.println("\n Size of Key list: " + keyList.size());

		for (String temp : keyList) {
			System.out.println(temp);
		}

		// Converting HashMap Values into ArrayList
		List<Integer> valueList = new ArrayList<Integer>(keyValue.values());
		// System.out.println("\n Size of Value list: " + valueList.size());
		for (Integer temp : valueList) {
			System.out.println(temp);
		}

		List<Entry> entryList = new ArrayList<Entry>(keyValue.entrySet());
		// System.out.println("\n==> Size of Entry list: " + entryList.size());
		for (Entry temp : entryList) {
			System.out.println(temp);
		}

	}

}
