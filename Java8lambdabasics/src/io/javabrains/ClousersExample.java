package io.javabrains;

public class ClousersExample {
	public static void main(String [] args) {
		int a = 10;
		int b = 20;
		//here b is closure wher its value is frozen by compiler
		doProcess(a, (i) -> System.out.println(i + b));
	}
	
	public static void doProcess(int i, Process p) {
		p.process(i);
	}
}

interface Process{
	void process(int i);
}