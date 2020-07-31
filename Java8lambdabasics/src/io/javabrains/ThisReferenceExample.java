package io.javabrains;

public class ThisReferenceExample {
	
	public void doprocess(int i, Process p) {
		p.process(i);
	}
	
	public void execute() {
		doprocess(10, (i) -> {
			System.out.println("value at i is" + i);
			System.out.println(this);
		});
	}
	
	public static void main(String [] args) {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		thisReferenceExample.doprocess(10, (i) -> {
			System.out.println("value at i is" + i);
			// this will not work
			//System.out.println(this);
		});
		thisReferenceExample.execute();
	}
	public String toString() {
		return "this is the main thisreference example class instance";
	}
}
