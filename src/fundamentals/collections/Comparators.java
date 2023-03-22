package fundamentals.collections;
import java.util.*;

/**
 * Comparator is used to create a custom sorting class 
 * that you can pass as a 2nd argument to Collections.sort() 
 * so that the collection list will be sorted based on the custom sort class
 *
 * This might actually be preferable for most cases than writing a Comparable class
 * because the class with Comparator can be reused,
 * and you can write multiple custom sort classes 
 * without needing to modify the custom object being sorted 
 */

class GradeSort implements Comparator<Student> {
	// Student class is used from Comparables.java
	
	@Override
	public int compare(Student s1, Student s2) {
		// If difference of grades is 0 meaning they are equal, 
		// then compare names alphabetically instead
		if (s1.getGrades() - s2.getGrades() == 0) {
			return s1.getName().compareTo(s2.getName());
		}
		
		// Compare based on grades (numerical order)
		return s1.getGrades() - s2.getGrades();
	}
}

public class Comparators {

	public static void main(String[] args) {
		Student jerome = new Student(2, "Jerome", 99); 
		Student jessica = new Student(1, "Jessica", 98); 
		Student maine = new Student(4, "Maine", 99); 
		Student deku = new Student(3, "Deku", 78); 
		
		List<Student> studentList = new ArrayList<>(Arrays.asList(maine, jessica, jerome, deku));
		Collections.sort(studentList, new GradeSort());
		
		for (Student s: studentList) {
			System.out.println(s.getGrades() + " " + s.getName());
		}
	}
}
