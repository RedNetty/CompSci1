package com.jack.compsci.friends;

import java.util.LinkedList;

public class Person {
    String name;
    int age;
    double  netWorth;
    LinkedList<Person> friends;


     Person(String name, int age, double netWorth) {
        this.name = name;
        this.age = age;
        this.netWorth = netWorth;
        this.friends = new LinkedList<>();
    }

    public void addFriend(Person newFriend) {
        if(friends == null) this.friends = new LinkedList<>();
        friends.add(newFriend);
    }

    public int getAge() {
        return age;
    }

    public double getNetWorth() {
        return netWorth;
    }


    public String getName() {
        return name;
    }

    public LinkedList<Person> getFriends() {
        return friends;
    }
}
