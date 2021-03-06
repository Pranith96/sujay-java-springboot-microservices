package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(4);
		set.add(1);
		set.add(5);
		set.add(3);
		System.out.println(set);
		
		for(Integer i : set) {
			System.out.println(i);
		}
		
		System.out.println(set.size());
		set.remove(3);
		System.out.println(set);

		
		Set<Integer> set1 = new LinkedHashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(4);
		set1.add(1);
		set1.add(5);
		set1.add(3);
		System.out.println(set1);
		
		Set<Integer> set2 = new TreeSet<>();
		set2.add(1);
		set2.add(2);
		set2.add(4);
		set2.add(1);
		set2.add(5);
		set2.add(3);
		System.out.println();
	}
}
