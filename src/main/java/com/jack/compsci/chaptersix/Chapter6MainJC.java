package com.jack.compsci.chaptersix;

import java.util.stream.IntStream;

public class Chapter6MainJC {

    public static void main(String[] args) {
        Person jack = new Person("Jack", "108 John green place", 23, 6157149687L);
        Person aj = new Person("AJ", "1832 Addison Drive", 22, 6158372221L);
        Person tanner = new Person("Tanner", "102 Unknown Lane", 23, 9134828322L);

        Car raceCar = new Car(2018, "Infiniti Q50"); //<- My car :)

        raceCar.setOwner(jack); //Added this for no reason other than it adds more to it.

        IntStream.range(0, 5).forEach(iteration -> {
            raceCar.accelerate();
        }); //Not entirely sure if we've used Lambda functions or IntStream in class, so if we haven't, I apologize.

        if(raceCar.getOwner()!= null) System.out.println("com.jack.compsci.chaptersix.Car's Owner: " + raceCar.getOwner().getName());

        System.out.println("com.jack.compsci.chaptersix.Car's Current Speed: " + raceCar.getSpeed());

        IntStream.range(0, 5).forEach(iteration -> {
            raceCar.brake();
        }); // Braking

        System.out.println("com.jack.compsci.chaptersix.Car's Current Speed: " + raceCar.getSpeed());


        System.out.println("------------------- People -----------------");
        System.out.println("\nName: " + jack.getName() + "\nAddress: " + jack.getAddress() + "\nAge: " + jack.getAge() + "\nPhone Number: " + jack.getPhoneNumber());
        System.out.println("\nName: " + aj.getName() + "\nAddress: " + aj.getAddress() + "\nAge: " + aj.getAge() + "\nPhone Number: " + aj.getPhoneNumber());
        System.out.println("\nName: " + tanner.getName() + "\nAddress: " + tanner.getAddress() + "\nAge: " + tanner.getAge() + "\nPhone Number: " + tanner.getPhoneNumber());
    }
}
