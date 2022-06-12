package com.company;

public class Person {
    String firstName;
    String lastName;
    MyDate birthday;


    public Person(String firstName, String lastName, MyDate birthday){
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthday=birthday;
    }

    public void print(){
        System.out.println(firstName + " " + lastName);
        birthday.print();
        System.out.println("Возраст: "+ getAge() + " лет");
        System.out.println("--------------------------------");

    }

    public  int getAge(){
        return 2022-birthday.year;
    }

    public void doWork(){
        System.out.println("I don't know how  I work");
    }




}
