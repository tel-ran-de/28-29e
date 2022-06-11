package com.company;



public class Main {

    public static void main(String[] args) {

        MyDate date1= createDate(6,6,1799);
        MyDate date2= createDate(9,10,1940);
        MyDate date3= createDate(9,6,2022);

        MyDate[] dates = {date1,date2,date3};
        for (int i = 0; i <dates.length ; i++) {
            dates[i].print();
        }

        Person person1= createPerson("Александр","Пушкин",date1);
        Person person2= createPerson("John","Lennon",date2);
        Person person3= createPerson("Ivan","Ivanov",date3);

        Person[] people = {person1,person2,person3};
        for (int i = 0; i < people.length; i++) {
            people[i].print();
        }

    }
    public static MyDate createDate(int day,int month, int year){
        MyDate date= new MyDate();
        date.day=day;
        date.month=month;
        date.year=year;
        return date;
    }

    public static Person createPerson(String firstName, String lastName, MyDate birthday){
        Person person = new Person();
        person.firstName=firstName;
        person.lastName=lastName;
        person.birthday=birthday;
        return person;
    }
}
