package com.ibm.tests.java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 *  Open Amazon.in
 *  Fetch all the links
 *  Fetch text from the links and remove empty links
 *  Remove duplicate 
 *  Sort the text in alphabetical order
 *  Print text starting with C and D
 */

public class AmazonExercise {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in"); // 1.
		
		driver.findElements(By.xpath("//a")).stream()
		.map(e->e.getText())
		.filter(s->!s.isBlank())
		.distinct()
		.sorted()
		.filter(s->s.startsWith("C")||s.startsWith("D"))
		.forEach(s->System.out.println(s));
		
		
		
		
		
		List<WebElement> list = driver.findElements(By.xpath("//a"));
		List<String> listoftexts = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			String linkText = list.get(i).getText(); // 2.
			if (!linkText.isBlank()) {
				listoftexts.add(linkText); // 3.
			}
		}

		for (int i = 0; i < listoftexts.size(); i++) {
			System.out.println(listoftexts.get(i));
		}

		Set<String> removeDuplicates = new HashSet<>(listoftexts);
		List<String> uniqueTexts = new ArrayList<String>(removeDuplicates);
		Collections.sort(uniqueTexts); // 4.

		for (int i = 0; i < uniqueTexts.size(); i++) {
			if (uniqueTexts.get(i).startsWith("C") || uniqueTexts.get(i).startsWith("D")) { // 5.
				System.out.println(uniqueTexts.get(i));
			}

			driver.quit();

		}

	}
}
