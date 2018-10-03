package com.silalahi.valentinus.advanced.collection;

/*
 * example The Set Interface
*/

import java.util.HashSet;
import java.util.Set;

public class FindDups2 {
	public static void main(String[] xxx) {
		Set<String> uniques = new HashSet<String>();
		Set<String> dups = new HashSet<String>();

		for (String a : xxx)
			if (!uniques.add(a))
				dups.add(a);

		// Destructive set-difference
		uniques.removeAll(dups);

		System.out.println("Unique words : " + uniques);
		System.out.println("Duplicate words : " + dups);
	}
}