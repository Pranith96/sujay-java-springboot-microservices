package com.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterExamples {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Stream<Integer> stream = list.stream().filter(x -> x % 2 == 0);
		List<Integer> listData = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(listData);

		list.stream().filter(x -> x % 2 == 0).forEach(y -> System.out.println(y));

		List<Student> student = Arrays.asList(new Student(1, "ABC", "ACTIVE"), new Student(2, "XYZ", "ACTIVE"),
				new Student(3, "qwert", "INACTIVE"));
		List<Student> studentOutput =student.stream().filter(data -> data.getStatus().equals("ACTIVE")).collect(Collectors.toList());
		System.out.println(studentOutput);
	}
}
