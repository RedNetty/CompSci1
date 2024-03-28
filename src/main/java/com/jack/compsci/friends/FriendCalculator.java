package com.jack.compsci.friends;

import java.util.LinkedList;
import java.util.Scanner;

public class FriendCalculator {
    
    public static void main(String[] args) {
        wompWomp();
    }

    public static void wompWomp(){
        LinkedList<Person> citizens = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        Person aj = new Person("Frank", 50, 120000.00);
        Person john = new Person("John", 24, 696969.69);
        Person harold = new Person("Harold", 26, 123.00); //<- broke 
        Person joe = new Person("Joe", 24, 16340.49);
        Person brodie = new Person("Brodie", 20, 5.00); //<- in poverty


        citizens.add(joe);
        citizens.add(brodie);
        citizens.add(aj);
        citizens.add(john);
        citizens.add(harold);


        john.addFriend(aj);
        john.addFriend(harold);
        aj.addFriend(harold);


        brodie.addFriend(joe);
        brodie.addFriend(john);

        joe.addFriend(aj);
        joe.addFriend(john);
        joe.addFriend(harold);

        citizens.forEach(guy -> {
            System.out.println("-- Citizen --");
            System.out.println("Name: " + guy.getName());
            System.out.println("Age: " + guy.getAge());
            System.out.println("Net-worth: " + guy.getNetWorth());
            System.out.println();
            System.out.println("Friends:");
            System.out.println(formatFriends(guy));
            System.out.println();
        });
        scanner.nextLine();
    }
    
    public static  String formatFriends(Person guy) {
        StringBuilder friends = new StringBuilder("none");
        for (Person friend : guy.getFriends()) {
            if(friends.toString().equalsIgnoreCase("none")) {
                friends = new StringBuilder(friend.getName());
            }else{
                friends.append(", ").append(friend.getName());
            }

        }
        return friends.toString();
    }
}

