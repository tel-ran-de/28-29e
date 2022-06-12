package com.company;

public class QAEngineer extends Person {
    public QAEngineer(String firstName, String lastName, MyDate birthday) {
        super(firstName, lastName, birthday);
    }
    public void doWork(){
        System.out.println("I am QAEngineer, I check programs");
    }

}
