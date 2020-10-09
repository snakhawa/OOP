package com.myjava.chapter4;

import java.util.Scanner;

public class DateSecondTry {

    private String month;
    private int day;
    private int year; //a four digit number.

    public void writeOutput() {

    }

    public void readInput() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter month, day, and year.");
        System.out.println("Do not use a comma.");
        month = keyboard.next();
        day = keyboard.nextInt();
        year = keyboard.nextInt();
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        if (month.equalsIgnoreCase("January")) return 1;
        else if (month.equalsIgnoreCase("February")) return 2;
        else if (month.equalsIgnoreCase("March")) return 3;
        else if (month.equalsIgnoreCase("April")) return 4;
        else if (month.equalsIgnoreCase("May")) return 5;
        else if (month.equalsIgnoreCase("June")) return 6;
        else if (month.equalsIgnoreCase("July")) return 7;
        else if (month.equalsIgnoreCase("August")) return 8;
        else if (month.equalsIgnoreCase("September")) return 9;
        else if (month.equalsIgnoreCase("October")) return 10;
        else if (month.equalsIgnoreCase("November")) return 11;
        else if (month.equalsIgnoreCase("December")) return 12;
        else {
            System.out.println("Fatal Error");
            System.exit(0);
            return 0; //Needed to keep the compiler happy
        }
    }

    /*
    Write a method called getNextYear that could be added to the class DateSecondTry in Display 4.2.
    The method getNextYear returns an int value equal to the value of the year instance variable plus one.
     */
    public int getNextYear(){
        return this.year + 1;
    }


}
