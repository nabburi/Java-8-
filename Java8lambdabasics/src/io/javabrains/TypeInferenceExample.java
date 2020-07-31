package io.javabrains;

public class TypeInferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printLamda((s) -> s.length());
		//StringLengthFunc myLambda = (s) -> s.length();
		//System.out.println(myLambda.getLength("Hello World!"));
	}
	
	public static void printLamda(StringLengthFunc l) {
		System.out.println(l.getLength("HelloWorld!"));
	}
	interface StringLengthFunc {
		int getLength(String s);
	}
}
