package oop.abstact;

public class Programmer extends Employee {
    String language;

    public Programmer(String name, int salary, String language) {
        super(name, salary);
        this.language = language;
    }

    public void printLanguage() {
        System.out.println("Language: " + language);
    }
}
