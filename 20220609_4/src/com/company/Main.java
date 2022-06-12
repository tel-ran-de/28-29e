package com.company;


import java.util.Date;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        MyDate date1= new MyDate(6,6,1799);
        MyDate date2= new MyDate(9,10,1940);
        MyDate date3= new MyDate(9,6);

        Date date= new Date();
        System.out.println(date);


        Person person1= new Programmer("Александр","Пушкин",date1);
        Person person2= new Person("John","Lennon",date2);
        Person person3= new Programmer("Ivan","Petrov",date3);
        Person person4= new QAEngineer("Georgi","Ivanov",date3);

        //Person person4= new Person("Nick","Nickolson",new MyDate(14,01,2000));


        Person[] people = {person1,person2,
                new Person("Ivan","Ivanov",date3),
                new Person("Nick","Nickolson",new MyDate(14,01,2000)),
                        person4,person3
        };
        for (int i = 0; i < people.length; i++) {
            people[i].doWork();
            people[i].print();

        }
    }


}
