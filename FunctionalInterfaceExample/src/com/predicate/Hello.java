package com.predicate;

import java.util.function.Predicate;

public class Hello implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		if (t % 2 == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Hello hello = new Hello();
		System.out.println(hello.test(7));

		Predicate<Integer> predicate = t -> t % 2 == 0;
		System.out.println(predicate.test(4));
	}
}
