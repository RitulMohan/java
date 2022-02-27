package com.company;

public class recusrion1 {
    public static void main(String[] args) {
        //program to print hello world
        print(1);
    }

    private static void print(int n) {
        //base condition
        if(n==5){
            System.out.println(5);
            return;
        }
        //if you call a function again and again, you can treat it as a separate call
        //recursive call
        System.out.println(n);

        //tail recursion: last function call
        print(n+1);
    }


}
