package com.company;

import java.util.Scanner;

public class Main {
    public static int chickens(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many chickens do you have?");
        return input.nextInt();
    }
    public static int cows(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many cows do you have?");
        return input.nextInt();
    }
    public static int pigs(){
    Scanner input = new Scanner(System.in);
        System.out.println("How many pigs do you have?");
        return input.nextInt();
    }
    public static void main(String[] args) {
        int pig = 4;
        final int cows = 4;
        final int chickens = 2;
        int finalans = pig * pigs() + cows * cows() + chickens * chickens();
        System.out.println("You have: "  + finalans + " legs ");
    }
}
