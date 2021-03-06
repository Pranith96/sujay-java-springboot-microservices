package com.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapExample {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "A");
		map.put(5, "B");
		map.put(6, "C");
		System.out.println(map);

		for (Map.Entry<Integer, String> data : map.entrySet()) {

			System.out.println(data.getKey() + " " + data.getValue());
		}

		map.remove(5);
		System.out.println(map);

		Map<Integer, String> map1 = new LinkedHashMap<>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(5, "C");
		map1.put(6, "A");
		map1.put(3, "B");
		map1.put(4, "C");
		System.out.println(map1);

		Map<Integer, String> map2 = new TreeMap<>();
		map2.put(1, "A");
		map2.put(2, "B");
		map2.put(5, "C");
		map2.put(6, "A");
		map2.put(3, "B");
		map2.put(4, "C");
		System.out.println(map2);

		Map<Integer, String> map3 = new ConcurrentHashMap<>();
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(5, "C");
		map3.put(6, "A");
		map3.put(3, "B");
		map3.put(4, "C");
		System.out.println(map3);
	}
}
