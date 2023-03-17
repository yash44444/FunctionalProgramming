package com.ibm.tests.lambdaexpression;

public abstract class Printer implements IPrintable {

	public static void main(String[] args) {

		IPrintable obj1 = new IPrintable() {
			@Override
			public void print() {
				System.out.println("lambda expression");
			}
		};
		
		obj1.print();

		IPrintable obj2 = ()-> System.out.println("lambda expression");
		obj2.print();

	}

}

/*
 * Line 7. RHS + anonymous class is understood by java as it is implenting interface method. 
 * so no need to mention. 
 * 
 * -> is the lambda operator
 * Lambda expressions are a shorthand way to create anonymous functions.
 * Action to be performed(anonymous class method) is written on RHS of arrow.
 * 
 * parameterized lambda: int sum = (int a, int b) -> int a + int b
 * 
 */
