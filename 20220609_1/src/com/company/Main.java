package com.company;

public class Main {

    public static void main(String[] args) {
        int s= sum(3);
    }
    public static int sum(int num){
        if (num<=0) {
            return 0;
        } else {
            return  num+sum(num-1);
        }
    }
}
