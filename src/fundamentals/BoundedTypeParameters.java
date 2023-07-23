package fundamentals;

public class BoundedTypeParameters {

	public static void main(String[] args) {
		System.out.println(add(1, 2)); // returns 3.0
	}
	
	// This is a good solution for creating a method
	// that can add integer, float, double by using a bounded type parameter.
	// Using Number as the bounded type is important to restrict
	// the params to numbers only despite being a generic.
	public static <T extends Number> double add(T num1, T num2) {
		double result = num1.doubleValue() + num2.doubleValue();
		return result;
	}
}