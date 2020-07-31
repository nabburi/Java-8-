package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {

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
		Collections.sort(people, new Comparator<Person>() {

					@Override
					public int compare(Person o1, Person o2) {
						return o1.getLastName().compareTo(o2.getLastName());
					}
		});
		//create method that prints all elements in the list
		printAll(people);
		//create a method thta prints all poeple that have last name begins with C
		//printing conditionally based on lastname
		printConditionally(people, new Condition() {
			
			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return p.getLastName().startsWith("C");
			}
		});
		
		//printing conditionally based on firstname
				printConditionally(people, new Condition() {
					
					@Override
					public boolean test(Person p) {
						// TODO Auto-generated method stub
						return p.getFirstName().startsWith("C");
					}
				});
	}

	private static void printConditionally(List<Person> people, Condition condition) {
		// TODO Auto-generated method stub
		for (Person p : people) {
			if(condition.test(p)) {
				System.out.println(p);
			}
		}
		
	}

	private static void printAll(List<Person> people) {
		// TODO Auto-generated method stub
		for(Person p : people) {
			System.out.println(p);
		}
	}
	
	

}

interface Condition {
	boolean test(Person p);
}