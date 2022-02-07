package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner person = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = person.nextLine();
        System.out.println("Hello " + name + " how are you?");
    }
    }