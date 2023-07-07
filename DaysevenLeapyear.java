package com.Assignment7;

import java.util.Scanner;

public class DaysevenLeapyear {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a year");
        int year = sc.nextInt();

        if(year<1582)
        {
            System.out.println("invalid year...!");
        }
        else if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
        {
            System.out.println( year  +  " :: it is leap year");
        }
        else
        {
            System.out.println( year +  " :: it is not leap year");
        }

    }
}
