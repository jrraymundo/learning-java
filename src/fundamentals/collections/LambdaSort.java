package fundamentals.collections;

import java.util.*;


/**
 * Using a Lambda expression can be an alternative for sorting your collection lists
 * 
 * Instead of creating a custom Comparator class or implementing Comparable,
 * You can pass Comparator.comparing(MyClass::methodToGetProperty) as another argument
 * for Collections.sort()
 *
 * Note that for the Lambda expression to work here
 * it requires that you create getters and setters in your custom class object
 */
public class LambdaSort {
	
	public static void main(String[] args) {
		Student jerome = new Student(2, "Jerome", 99); 
		Student jessica = new Student(1, "Jessica", 78); 
		Student maine = new Student(4, "Maine", 99); 
		Student deku = new Student(3, "Deku", 101); 
		
		List<Student> studentList = new ArrayList<>(Arrays.asList(maine, jessica, jerome, deku));
		
		// Pass Lambda expression as 2nd argument of Collections.sort()
		// The .thenComparing() is used for cases where comparing "grades" resulted to equal
		// so the next step is to compare their "names" for the final ordering
		Collections.sort(studentList, Comparator.comparing(Student::getGrades).thenComparing(Student::getName));
		
		for (Student s: studentList) {
			System.out.println(s.getGrades() + " " + s.getName());
		}
	}
}
