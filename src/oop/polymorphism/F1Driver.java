package oop.polymorphism;

public class F1Driver extends Driver {
    String team = "Default F1 Team";

    public F1Driver(String name, String car, boolean isLicensed, String team) {
        super(name, car, isLicensed);
        this.team = team;
    }

    public String getF1Team() {
        return team;
    }

    @Override
    public void greeting() {
        System.out.printf("Hello I'm %s, and I'm an F1 driver from %s\n", name, team);
    }
}
