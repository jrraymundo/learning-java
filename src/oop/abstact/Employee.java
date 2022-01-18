package oop.abstact;

/**
 * An abstract class is a class that is only meant to be extended
 * This Employee class cannot be instantiated,
 * it can only be extended so the subclass can inherit the methods and variables
 */

public abstract class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void printEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}
