package hackerRank;

import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class SortHelper implements Comparator<Student> {

    public int compare(Student a, Student b) {
        int gradeComparison = Double.compare(b.getCgpa(), a.getCgpa());

        if (gradeComparison == 0) {
            int nameComparison = a.getFname().compareTo(b.getFname());

            if (nameComparison == 0) {
                return Integer.compare(a.getId(), b.getId());
            }

            return nameComparison;
        }

        return gradeComparison;
    }
}

//Complete the code
public class Sort
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        SortHelper sorter = new SortHelper();
        Collections.sort(studentList, sorter);

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}

/*
5
33 Rumpa 3.68
85 Ashis 3.85
56 Samiha 3.75
19 Samara 3.75
22 Fahim 3.76
 */


