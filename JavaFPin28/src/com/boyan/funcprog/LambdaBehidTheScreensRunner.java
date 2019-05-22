package com.boyan.funcprog;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {
	@Override
	public boolean test(Integer number) {
		return number % 2 == 0;
	}
}

class PrintValueConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer result) {
		System.out.println(result);
	}
	
}

class NumberSquareMapper implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer number) {
		return number * number;
	}
}

public class LambdaBehidTheScreensRunner {
	
	public static void main(String[] args) {
		
		//1. Storing functions in variables
		//2. Passing functions to methods
		//3. Returning functions from methods
		
		Predicate<? super Integer> evenPredicate = createEvenPredicate();
		Predicate<? super Integer> oddPredicate = n -> n % 2 == 1;
		
		List.of(23, 43, 34, 47, 38, 35).stream()
			.filter(evenPredicate)
			.map(n -> n * n)
			.forEach(System.out::println);
		
		List.of(23, 43, 34, 47, 38, 35).stream()
			.filter(new EvenNumberPredicate())
			.map(new NumberSquareMapper())
			.forEach(new PrintValueConsumer());
		// .map(n -> n * n)
		// <R> Stream<R> map(Function<? super T, ? extends R> mapper);
		// R apply(T t);
		
	}

	private static Predicate<? super Integer> createEvenPredicate() {
		return n -> n % 2 == 0;
	}

}

