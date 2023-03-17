package com.ibm.tests.java8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaStreams {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		/* 
		 * stream is a sequence of elements that can be processed in parallel or sequentially. 
		 * Streams support a wide range of operations, such as filtering, mapping, sorting, and reducing. 
		 * These operations can be chained together to perform complex data transformations in a very concise 
		 * and readable way.
		 *  
		 *  Streams offer below methods:
		 *  1) filter()
		 *  2) map()
		 *  3) reduce()
		 *  4) forEach()
		 *  5) distinct()
		 *  6) sorted()
		 * 
		 */
		
		driver.findElements(By.xpath("//a")).stream()
		.map(e->e.getText())
		.filter(s->!s.isBlank())
		.distinct()
		.sorted()
		.filter(s->s.startsWith("C")||s.startsWith("D"))
		.forEach(s->System.out.println(s));

	}

}
