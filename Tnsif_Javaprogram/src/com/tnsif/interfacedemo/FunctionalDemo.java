package com.tnsif.interfacedemo;

public class FunctionalDemo {

    public static void main(String[] args) {
    
        // Lambda Expression implementation of GreetingDemo
        GreetingDemo gd = () -> 
            System.out.println("Hello Everyone, Welcome to the Java Session");
        
        gd.greet();
    }
}
