package oop.polymorphism;

public class Driver {
    String name = "";
    String car = "";
    boolean isLicensed = true;

    public Driver(String name, String car, boolean isLicensed) {
        this.name = name;
        this.car = car;
        this.isLicensed = isLicensed;
    }

    public String getName() {
        return name;
    }

    public String getCar() {
        return car;
    }

    public boolean checkIfLicensed() {
        return isLicensed;
    }

    public void greeting() {
        System.out.printf("Hello I'm %s, and I'm a driver", name);
    }
}
