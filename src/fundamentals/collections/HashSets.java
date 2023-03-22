package fundamentals.collections;

import java.util.*;

/**
 * Use HashSet for storing unique values
 * Initial capacity of a HashSet is 16 
 */

public class HashSets {
	
	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<>(Arrays.asList("jerome", "jessica", "coco"));
		set1.add("martin");
		System.out.println(set1.toString());

		Set<String> set2 = new HashSet<>(Arrays.asList("basha", "lj", "coco"));
		System.out.println(set2.toString());
		
		// Check if all values of set2 is in set1
		System.out.println(set1.containsAll(set2));
		
		// Remove all values in set1 that are present in set2
		set1.removeAll(set2);
		System.out.println("Remove all set2 " + set1.toString());
		
		// Retain all values in set1 that are present in set2
		// Since all values of set2 were already removed at this point, 
		// everything is removed in set1
		set1.retainAll(set2);
		System.out.println("Retain all set2 " + set1.toString());
	}
}
