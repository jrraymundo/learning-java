package fundamentals;

import java.util.Arrays;
import java.util.*;
import java.io.*;

public class WildcardsUpperLowerBounded {
	
	public static void runUpperBounded() {
		List<Integer> list4 = new ArrayList<>();
		list4.add(1);
		list4.add(2);
		list4.add(3);
		checklistUpperBounded(list4);
		double sumOfList = sumListUpperBounded(list4);
		System.out.println (sumOfList);
	}

	public static void checklistUpperBounded(List<? extends Number> list) {
		for (Number n: list) {
			// Print n
		}
	}

	public static double sumListUpperBounded(List<? extends Number> list) {
		double sum = 0;
		for (Number n: list) {
			sum += n.doubleValue();
		}
		return sum;
	}
	
	public static void runLowerBounded() {
		List<? super Integer> list1 = new ArrayList<>();
		list1.add(1);
		
		List<Number> list2 = new ArrayList<>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		checkListLowerBounded(list2);
	}
	
	
	public static void checkListLowerBounded(List<? super Number> list) {
		// Reading lower bounded wildcards can still work by using Object superclass
		for (Object n: list) {
			System.out.println(n);
		}
	}

	/*
	 	Practical application of Upper and Lower bounded wildcards
	 	A reusable copy method is created, it can copy a source List into a destination list
	*/
	public static <T> void copy(List<? extends T> source, List<? super T> destination) {
		for (T n : source) {
			destination.add(n);
		}
	}

	public static void main(String[] args) {
		runLowerBounded();
		
		List<Integer> myList = Arrays.asList(1, 2, 3, 6, 9);
		List<Integer> duplicateList = new ArrayList<>();
		copy(myList, duplicateList);
		System.out.println(duplicateList);
		
	}
}
