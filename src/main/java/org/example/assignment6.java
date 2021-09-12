/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Tony Tang
 */

package org.example;
import java.util.Scanner;
import java.util.*;
import java.lang.*;


public class assignment6 {

    public static void main( String[] args ) {

        Scanner in = new Scanner(System.in);

        int current_year = Calendar.getInstance().get(Calendar.YEAR);

        System.out.print("What is your current age? ");
        int age = in.nextInt();

        System.out.print("At what age would you like to retire? ");
        int retirement = in.nextInt();

        int years = retirement - age;
        System.out.println("You have " + years + " years left until you can retire.");

        int retire_year = current_year + years;
        System.out.println("It's " + current_year +", so you can retire in " + retire_year + ".");
    }

}