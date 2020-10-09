package com.myjava.chapter4;

public class DateFirstTry {

    public String month;
    public int day;
    public int year; //a four digit number.

    public void writeOutput() {
        System.out.println(month + " " + day + ", " + year);
    }

    /*
    1. Write a method called makeItNewYears that could be added to the class DateFirstTry in Display 4.1.
    The method makeItNewYears has no parameters and sets the month instance variable to "January"
    and the day instance variable to 1. It does not change the year instance variable.
     */
    public void makeItNewYears(){
        this.month = "January";
        this.day = 1;
    }
    /*
    2. Write a method called yellIfNewYear that could be added to the class DateFirstTry in Display 4.1.
    The method yellIfNewYear has no parameters and outputs the string "Hurrah!" provided
    the month instance variable has the value "January" and the day instance variable has the value 1.
    Otherwise, it outputs the string "Not New Year's Day."
     */
    public void yellIfNewYear(){
        if(this.month == "January" && this.day == 1){
            System.out.println("Hurray");
        }
        else{
            System.out.println("Not New Year's Day");
        }
    }
}
