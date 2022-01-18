package oop.abstact;

public class Main {

    public static void main(String[] args) {
        Programmer employee1 = new Programmer("Jerome Raymundo", 99999, "Java");
        employee1.printEmployeeDetails();
        employee1.printLanguage();

        // Employee employee2 = new Employee(); 'Employee' is abstract; cannot be instantiated
    }
}
