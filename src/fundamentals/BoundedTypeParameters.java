package fundamentals;

public class BoundedTypeParameters {

	public static void main(String[] args) {
		System.out.println(add(1, 2)); // returns 3.0
	}
	
	public static <T extends Number> double add(T num1, T num2) {
		double result = num1.doubleValue() + num2.doubleValue();
		return result;
	}
}