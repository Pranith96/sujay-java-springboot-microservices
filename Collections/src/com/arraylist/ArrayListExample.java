package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListExample {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		System.out.println(list);
		System.out.println(list.get(3));
		list.size(); // 4
		list.remove(3);
		System.out.println(list);

		for (Integer i : list) {
			System.out.println(i);
		}

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.println(list1);

		List<Student> student = new ArrayList<>();
		student.add(new Student(1, "abc", "1234567"));
		student.add(new Student(2, "qwertyu", "123456789"));

		List<Student> students = Arrays.asList(new Student(1, "abc", "1234567"),
				new Student(2, "qwertyu", "123456789"));
		
		System.out.println(student);
		System.out.println(students);

		List<Integer> list2 = new LinkedList<>();
		Vector<Integer> vector = new Vector<>();
	}

}
