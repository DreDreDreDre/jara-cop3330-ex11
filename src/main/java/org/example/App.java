package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Andre Jara
 */

public class App 
{
    public static void main( String[] args )
    {
        double c_to;
        double c_from;
        double rate;
        Scanner sc = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        c_from = sc.nextDouble();

        System.out.print("What is the exchange rate? ");
        rate = sc.nextDouble();

        c_to = c_from * rate;
        System.out.printf("%.2f euros at an exchange rate of %f is %.2f U.S. dollars.", c_from, rate, c_to);

        sc.close();
    }
}
