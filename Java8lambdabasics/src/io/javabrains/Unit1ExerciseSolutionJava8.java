package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1ExerciseSolutionJava8 {

	public static void main(String[] args) {
		List<Person> people =  Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Caryle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Mathew", "Arnold", 39),
				new Person("Kent", "Clark", 30)
				);
		
		//sort list by lastname
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		//create method that prints all elements in the list
		perfromConditionally(people, (p)-> true, p -> System.out.print(p));
		//create a method thta prints all poeple that have last name begins with C
		//printing conditionally based on lastname
		perfromConditionally(people, (p) -> p.getLastName().startsWith("C"), p -> System.out.print(p.getLastName()));
		
		//printing conditionally based on firstname
		perfromConditionally(people, (p)-> p.getFirstName().startsWith("C"), p -> System.out.print(p.getFirstName()));
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
