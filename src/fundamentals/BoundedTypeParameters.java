package fundamentals;

public class BoundedTypeParameters {

	public static void main(String[] args) {
		System.out.println(add(1, 2)); // returns 3.0
		
		String[] letters = {"a", "b", "c", "d"};
		System.out.println(countGreaterItemsA(letters, "a"));
		
		Integer[] numbers = {1, 2, 3, 4, 5};
		System.out.println(countGreaterItemsA(numbers, 3));
	}
	
	// This is a good solution for creating a method
	// that can add integer, float, double by using a bounded type parameter.
	// Using Number as the bounded type is important to restrict
	// the params to numbers only despite being a generic.
	public static <T extends Number> double add(T num1, T num2) {
		double result = num1.doubleValue() + num2.doubleValue();
		return result;
	}
	
	// My own solution
	// We write extends Comparable<T> because we want to make sure that only classes
	// that implement Comparable can be passed as arguments
	public static <T extends Comparable<T>> int countGreaterItemsA(T[] items, T item) {
		int greaterCount = 0;
		for (int i = 0; i < items.length; i++) {
			if (items[i].compareTo(item) > 0) {
				greaterCount += 1;
			}				
		}
		return greaterCount;
	}
	
	// Solution from udemy course
    public static <T extends Comparable<T>> int countGreaterItemsB(T[] items, T item) {
	    int counter = 0;
	    for (T t : items) {
	    	if (t.compareTo(item) > 0) {
	    		++counter;	    		    		
	    	}
	    }
	    return counter;
	} 
}