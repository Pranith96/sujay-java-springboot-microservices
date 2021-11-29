package com.consumer;

import java.util.function.Consumer;

public class Display implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {

		System.out.println(t);
	}

	public static void main(String[] args) {
		Display display = new Display();
		display.accept(6);
		Consumer<Integer> dis = t -> System.out.println(t);
		dis.accept(6);
	}
}
