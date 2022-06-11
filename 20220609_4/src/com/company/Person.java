package com.company;

public class Person {
    String firstName;
    String lastName;
    MyDate birthday;

    public void print(){
        System.out.println(firstName + " " + lastName);
        birthday.print();
        System.out.println("Возраст: "+ getAge() + " лет");
        System.out.println("--------------------------------");

    }

    public  int getAge(){
        return 2022-birthday.year;
    }




}
