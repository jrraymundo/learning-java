package fundamentals.collections;

import java.util.*;

/**
 * In order to sort Collection Lists consisting of objects,
 * the Comparable interface should be implemented in the object
 * and create an override of the compareTo method 
 */

class Student implements Comparable<Student> {
	public int id;
	public String name;
	public int grades;
	
	public Student(int id, String name, int grades) {
		this.id = id;
		this.name = name;
		this.grades = grades;
	}

	@Override
	public int compareTo(Student otherStudent) {		
		// If difference of grades is 0 meaning they are equal, then compare names alphabetically instead
		if (this.grades - otherStudent.grades == 0) {
			return this.name.compareTo(otherStudent.name);
		}
		
		// Compare based on grades (numerical order)
		return this.grades - otherStudent.grades;
		
		// For descending order, 
		// Numerical -- switch to otherStudent.grades - this.grades;
		// Alphabetical -- just add a negative sign to the returned value
	}
}

public class Comparables {
	
	public static void main(String[] args) {
		Student jerome = new Student(2, "Jerome", 99); 
		Student jessica = new Student(1, "Jessica", 98); 
		Student maine = new Student(4, "Maine", 99); 
		Student deku = new Student(3, "Deku", 78); 
		
		List<Student> studentList = new ArrayList<>(Arrays.asList(maine, jessica, jerome, deku));
		Collections.sort(studentList);
		
		for (Student s: studentList) {
			System.out.println(s.name);
		}
	}
}
