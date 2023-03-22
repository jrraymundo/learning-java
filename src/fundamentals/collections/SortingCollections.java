package fundamentals.collections;

import java.util.*;

public class SortingCollections {
	
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(11, 23, 88, 34, 14));
		System.out.println(numbers.toString() + "\n");
		
		// Default sort in ascending order
		Collections.sort(numbers);
		System.out.println(numbers.toString());
		
		// Sort in descending or reverse order
		Collections.sort(numbers, Collections.reverseOrder());
		System.out.println(numbers.toString());
	}
}
