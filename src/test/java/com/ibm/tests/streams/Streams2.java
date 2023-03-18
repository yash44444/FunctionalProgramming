package com.ibm.tests.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Streams2 {

	public static void main(String[] args) {
		// Find sum of all numbers using java streams
		List<Integer> list = Arrays.asList(1, 22, 3, 24, 3, 22, 56, 26);

		Optional<Integer> sum = list.stream().reduce((a, b) -> a + b);
		System.out.println(sum.get());		
		
		// Find sum of all numbers using java streams
		double avg = list.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println(avg);
		
		/*
		 * we convert the Stream<Integer> to an IntStream using the mapToInt() method. 
		 * This is because the average() method is only available for IntStream, LongStream, and 
		 * DoubleStream interfaces in Java.
		 */
		
		// Find the square of each number,exclude number < 100 and then find the average
		double avrg = list.stream().map(e->e*e).mapToInt(e->e).filter(e -> e<500).average().getAsDouble();
		System.out.println(avrg);
		
		// Find even and odd numbers
		List<Integer> even = list.stream().filter(e -> e%2==0).collect(Collectors.toList());
		System.out.println(even);
		
		List<Integer> odd = list.stream().filter(e -> e%2!=0).collect(Collectors.toList());
		System.out.println(odd);
		
		// print numbers starting with 2
		List<Integer> prefix2 = list.stream().map(e -> String.valueOf(e))
		.filter(e -> e.startsWith("2"))
		.map(Integer::valueOf)
		.collect(Collectors.toList());
		
		System.out.println(prefix2);
		
		/*  To select numbers starting with 2, we need to use startsWith method from string class.
		 *  For this we need to convert each number in the list to string using String.valueOf method.
		 *  Now, to collect result back as a list, we need to convert string to int using Integer.valueOf method.
		 *  Finally. collect as list
		 */
		
		// Print duplicate
		Set<Integer> dup = list.stream().filter(e -> Collections.frequency(list, e)>1).collect(Collectors.toSet());
		System.out.println(dup);
		
		// Find Max and Minimum
		int max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max);
		
		int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(min);
		
		// sort the numbers ( ascending )
		List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted);
		
		List<Integer> reverse = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverse);
		
		// find second highest number
		int secnHighest = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println(secnHighest);
		
		int secnLowest = list.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println(secnLowest);
		
		
		
	
		
	
		

	}

}
