package com.jack.compsci.chaptersix;

public class Person {
    private String name;
    private String address;
    private int age;
    private long phoneNumber; //Using Longs for storing phone numbers not entirely sure if you wanted this or Strings.


    Person(String name, String address, int age, long phoneNumber) {
        this.address = address;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }
}
