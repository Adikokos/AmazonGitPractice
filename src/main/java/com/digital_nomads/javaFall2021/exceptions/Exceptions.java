package com.digital_nomads.javaFall2021.exceptions;

public class Exceptions {
    public static void main(String[] args) {

        try {
            int a [] = new int[3];
            System.out.println(a[4]);
            System.out.println("hello world");
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("An error occurred");
        }

        System.out.println("hello world");





    }



}
