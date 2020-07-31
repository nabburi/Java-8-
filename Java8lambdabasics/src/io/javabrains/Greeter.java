package io.javabrains;

public class Greeter {

	public void greet(Greeting greeting) {
		//System.out.println("Hello World!");
		greeting.perform();
	}
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		//an insstance of a class that implements greetings interface
		//alternatively we can create an anonymous innerclass
		Greeting helloWorldGreeting = new HelloWorldGreeting();
		//greeter.greet(helloWorldGreeting);
		//greeter.greet();
		//a lamda expression of type greeting interface
		Greeting myLamdaFunction = () -> System.out.print("Hello World!");
		//MyAdd addFunc = (int a, int b) -> a+b;
		//way to excecute lamda expressions
		myLamdaFunction.perform();
		
		greeter.greet(myLamdaFunction);
	}
}

interface MyLamda {
	void foo();
}
/*
 * interface MyAdd{ int add(int x, int y); }
 */