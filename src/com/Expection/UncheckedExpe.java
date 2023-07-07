package com.Expection;

public class Unwanted {
    public static void main(String[] args) {
        System.out.println("program started");
        int a = 12, b = 0, c;//divided by zero giving expection
        try   //throws expection use try
        {
            c = a / b;
            System.out.println(c);
        }
        catch (Exception e) //handle expection
        {
            System.out.println("cant divid");
        }
        finally
        {
            System.out.println("main program");
        }
    }
}
