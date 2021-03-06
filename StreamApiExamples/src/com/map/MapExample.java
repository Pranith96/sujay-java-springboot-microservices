package com.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.filter.Student;

public class MapExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> listsData = list.stream().map(x -> x * 5).collect(Collectors.toList());
		System.out.println(listsData);

		List<Student> student = Arrays.asList(new Student(1, "ABC", "ACTIVE"), new Student(2, "XYZ", "ACTIVE"),
				new Student(3, "qwert", "INACTIVE"));

		student.stream().map(response ->{
			response.setId(4);
			response.setStatus("ACTIVE");
			response.setStudentName("Pranith");
			return response;
		}).forEach(s->System.out.println(s));
	}
}
