package com.company;

public class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int day,int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public MyDate(int day,int month){
        this.day=day;
        this.month=month;
        this.year=2022;
    }


    public void print(){
        System.out.println(((day<10)?"0"+day:day)+"-"+month+"-"+year);
    }

}
