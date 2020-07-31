package io.javabrains;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] somenum = {1,2,3,4,5};
		int key = 0;
		/*
		 * BiConsumer<Integer, Integer> handlingException = (v, k) -> { try {
		 * System.out.println(v/k); } catch(ArithmeticException e) {
		 * System.out.println("An arithemtic exception happened"); }
		 */
		process(somenum, key, wrapperLambda((v, k) -> System.out.println(v/k)));

	}

	private static void process(int[] somenum, int key, BiConsumer<Integer, Integer> consumer) {
		// TODO Auto-generated method stub
		for (int i : somenum) {
			consumer.accept(i, key);
		}
	}

	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		return (a,b) -> {
			try {
			consumer.accept(a, b);
			}
			catch(ArithmeticException e) {
				System.out.println("Exception happened in wrapper lambda");
			}
		};
	}
	
}
