package fundamentals;

import java.util.Arrays;

public class SortingArrays {

	// Two sorting algorithms that Java uses
	// 1. QuickSort - to sort primitive types (int, float, etc.)
	// 2. MergeSort - to sort reference types (Integer, String, etc.)
	
	public static void main(String[] args) {
		int[] numbers = { 10, 23, 13, 6 };
		System.out.println(Arrays.toString(numbers));
		Arrays.sort(numbers);
		
		for (int num: numbers) {
			System.out.println(num);
		}
		
		String[] names = {"Norman", "Bruce", "Jerome", "Zack", "Jessica"};
		System.out.println(Arrays.toString(names));
		Arrays.sort(names);
		
		for (String name: names) {
			System.out.println(name);
		}
	}
}
