package com.company;

public class Programmer extends Person {


    public Programmer(String firstName, String lastName, MyDate birthday) {
        super(firstName, lastName, birthday);
    }

    public void doWork(){
        System.out.println("I am programmer, I write codes");
    }


}
