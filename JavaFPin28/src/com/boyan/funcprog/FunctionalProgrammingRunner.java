package com.boyan.funcprog;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
		printWithFP(list);

	}

	private static void printWithFP(List<String> list) {
		list.stream()
			.forEach(System.out::println);		
	}

}
