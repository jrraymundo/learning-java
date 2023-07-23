package fundamentals;

public class ComparingValues {
	
/**
 * A string literal compared with a string object using == operator 
 * will always be false regardless if the string values are the same.  
 * Because Java actually compares the two by their reference or address.
 * 
 * That's why it's suggested to always compare two String objects 
 * using the equals() method and never compare them using the == operator, 
 * because you never know which one is coming from pool 
 * and which one is created using new() operator. 
 */
	public static void main(String[] args) {
		String A1 = "A";
		String A2 = "A";
		System.out.println(A1 == "A"); // true		
		System.out.println(A1.equals(A2)); // true
		System.out.println(A1.equals("A")); // true		
		
		String A3 = new String("A");
		System.out.println(A3 == A1); // false
		System.out.println(A3 == A2); // false
		System.out.println(A3 == "A"); // false
		System.out.println(A3.equals(A1)); // true
		System.out.println(A3.equals(A2)); // true
	}
}
