package com.boyan.funcprog;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
		printWithFP(list);
		printWithFPWithFiltering(list);

	}

	private static void printWithFPWithFiltering(List<String> list) {
		list.stream()
			.filter(element -> element.endsWith("at"))
			.forEach(System.out::println);
		
	}

	private static void printWithFP(List<String> list) {
		list.stream()
			.forEach(System.out::println);		
	}

}
