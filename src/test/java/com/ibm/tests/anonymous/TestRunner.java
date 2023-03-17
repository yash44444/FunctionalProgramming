package com.ibm.tests.anonymous;

public class TestRunner {

	public static void main(String[] args) {

		IPrintable obj = new IPrintable() {
			@Override
			public void print() {
				System.out.println("hello, this is anonymous inner class");
			}
		};
		obj.print();
	}

}

/*
 * 
 *  As we know class have a method which reside inside curly braces { }. Similarly, the print method.
 *  resides here inside curly braces which acts like a class but without having any name.
 *  This is why it is called anonymous inner class. In the local repository you would see, TestRunner$1.class
 *  and TestRunner.class
 *  
 *  It's like creating a new class on the spot, and it's useful when you only need to use the class once and 
 *  don't want to clutter your code with a bunch of class definitions.
 *  If the runner class have to override only one method of an interface, we do not need
 *  a new class to be created to implement the method, instead it can be done directly in the runner class.
 *  
 *  
 */
