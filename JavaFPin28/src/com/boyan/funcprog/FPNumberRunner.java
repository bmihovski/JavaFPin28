package com.boyan.funcprog;

import java.util.List;
import java.util.stream.IntStream;

public class FPNumberRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);
		
		//Exercise - Print squares of first 10 numbers!
		//Clue - Intstream.range(1, 10)
		
		IntStream.range(1, 11).map(x -> x * x).forEach(System.out::println);
		
		//List.of("Apple", "Ant", "Bat").stream()
		//Map all of these to lowercase and print them
		
		List.of("Apple", "Ant", "Bat").stream().map(String::toLowerCase).forEach(System.out::println);
		
		
		//List.of("Apple", "Ant", "Bat").stream()
		//Print the length of each element  Clue use map
		List.of("Apple", "Ant", "Bat").stream().map(String::length).forEach(System.out::println);
		
		
		
		
		
		int numSum = sumOfNums(numbers);
		System.out.println(numSum);
		
		int oddSum = oddSum(numbers);
		
		System.out.println(oddSum);
		
		int evenSum = evenSum(numbers);
		System.out.println(evenSum);
		
	}

	private static int evenSum(List<Integer> numbers) {
		return numbers.stream()
				.filter(x -> x % 2 == 0)
				.reduce(0, (acc, num) -> acc + num);
	}

	private static int oddSum(List<Integer> numbers) {
		return numbers.stream()
				.filter(x -> x % 2 == 1)
				.reduce(0, (acc, num) -> acc + num);
	}

	private static int sumOfNums(List<Integer> numbers) {
		return numbers.stream()
				.reduce(0,
						(acc, numb) -> acc + numb);
	}

}
