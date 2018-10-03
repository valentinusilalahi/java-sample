package com.silalahi.valentinus.advanced.collection;

/*
 * example The Set Interface
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDups {
	public static void main(String[] xxx) {
		// Using JDK 8 Aggregate Operations
		Set<?> distinctWords = Arrays.asList(xxx).stream().collect(Collectors.toSet());
		System.out.println(distinctWords.size() + " Distinct Words : " + distinctWords);

		// Using the for-each Construct
		Set<String> s = new HashSet<String>();
		for (String a : xxx)
			s.add(a);
		System.out.println(s.size() + " distinct words : " + s);

	}
}
