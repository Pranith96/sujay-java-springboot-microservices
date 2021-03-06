package com.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {

		Supplier<Student> students = () -> {
			return new Student(1, "ABC", "123456789");
		};
		System.out.println(students.get());
		
		Supplier<Integer> response = () -> {
			return new Random().nextInt();
		};
		System.out.println(response.get());
	}
}
