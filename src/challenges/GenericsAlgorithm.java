package challenges;
import java.util.*;

public class GenericsAlgorithm {
	
	public static void main(String[] args) {
		runExercise();
	}
	
	public static void runExercise() {
        
        // you have to implement the other classes such that the following code can run without any error
        
        Library<Algorithm> library = new Library<>();
		library.add(new SearchAlgorithm());
		library.add(new SortingAlgorithm());
		library.add(new GraphAlgorithm());
		
		Algorithm item = library.getLast();
		
		while(item!=null) {
			item.execute();
			item = library.getLast();
		}
    }
}

class Algorithm {
    public void execute() {}
}

class SearchAlgorithm extends Algorithm {}

class SortingAlgorithm extends Algorithm {}

class GraphAlgorithm extends Algorithm {}

class Library<T extends Algorithm> {
	Deque<T> list;
	
	public Library() {
		list = new ArrayDeque<>();
	}
	
	public void add(T item) {
		list.push(item);
	}
	
	public T getLast() {
		T item = list.pollLast();
		System.out.println(item);
		return item;
	}
}
