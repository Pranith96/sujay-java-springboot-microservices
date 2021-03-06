package com.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.filter.Student;

public class SortedExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 10, 17, 3, 21, 11, 12, 4, 5, 6, 7, 14, 8, 9, 10);
		List<Integer> list1 = list.stream().sorted().collect(Collectors.toList());
		System.out.println(list1);

		List<Student> student = Arrays.asList(new Student(6, "ABC", "ACTIVE"), new Student(4, "XYZ", "ACTIVE"),
				new Student(3, "qwert", "INACTIVE"));

		List<Student> studentResponse = student.stream().sorted(Comparator.comparing(Student::getStudentName))
				.collect(Collectors.toList());
		System.out.println(studentResponse);
	}
}
