package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {
	public static void main(String[] args) {
		List<Person> people =  Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Caryle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Mathew", "Arnold", 39),
				new Person("Kent", "Clark", 30)
				);
		
		perfromConditionally(people, (p)-> true, System.out::println);
		
	}

	private static void perfromConditionally(List<Person> people, Predicate<Person> predicte, Consumer<Person> consumer) {
		// TODO Auto-generated method stub
		for (Person p : people) {
			if(predicte.test(p)) {
				consumer.accept(p);
			}
		}
		
	}

}