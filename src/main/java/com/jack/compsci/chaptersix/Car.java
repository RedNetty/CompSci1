package com.jack.compsci.chaptersix;

public class Car {

    private int yearModel;
    private String make;
    private int speed;
    private Person owner;


    Car(int yearModel, String make) {
        this.yearModel = yearModel;
        this.make = make;
    }

    public int getSpeed() {
        return speed;
    }

    public int getYearModel() {
        return yearModel;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public String getMake() {
        return make;
    }

    public void accelerate() {
        speed += 5;
    }
    public void brake() {
        speed -= 5;
    }
}
