package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class Starpattern {
    //   public static void main(String[] args) {
//        int i = 0;
//        int sum = 0;
//        int count = 0;
//        for (i = 0; i < 15; i++) {
//            sum = count + sum;
//
//            if (i % 2 == 0) {
//                System.out.println(i);
//                count++;
//            }
//
//
//        }
//        System.out.println("sum of even  num" + sum);
//        System.out.println("cont even no" + count);
//    }
    public static void main(String[] args) {
//        int rows=5;
//        for (int i=1;i<=4;i++)
//        {
//            for (int j=1;j<=i;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//       Scanner sc = new Scanner(System.in);
//       System.out.println("Enter a first No  :: ");
//       int firstNo= sc.nextInt();
//
//       System.out.println("Enter a second no::");
//       int seconNo= sc.nextInt();
//
//       int sum = firstNo + seconNo;
//       System.out.println("Multiplication of two no::  "  +sum);

//       Scanner Sc = new Scanner(System.in);
//       System.out.println("Enter a first name->");
//       String firstname = Sc.nextLine();
//
//       System.out.println("Enter a middle name->");
//       String middlename =Sc.nextLine();
//
//       System.out.println("Enter a last name->");
//       String Lastname = Sc.nextLine();
//
//       String fullname =(" "+firstname)+("  "+middlename)+(" "+Lastname);

//        int i = 0;
//        int sum = 0;
//        int count = 0;
//        for (i = 0; i <=12; i++) {
//            sum = sum + count;
//
//            if (i % 2 == 0) {
//                System.out.println(i);
//                count++;
//            }
//
//
//        } System.out.println("sum of even no::" + sum);
//        System.out.println("sum of count oof even no" + count);

//        int[] pk = new int[4];
//        pk[0] = 12;
//        pk[1] = 13;
//        pk[2] = 14;
//        pk[3] = 15;
//        int count=0;
//        for (int i = 0; i <= pk.length; i++) {
//
//            System.out.println(pk[i]);
//        if(i%2==0) {
//            System.out.println("Even no"+pk[i]);
//             count++;
//
//        }
//        if (i%2!=0){
//            System.out.println("odd no"+pk[i]);
//        }
//
//        }
        ArrayList list =new ArrayList<>();
        list.add(0,11);
        list.add(1,12);
        list.add(2,13);
        list.add(3,14);
        list.add(4,15);
        list.add(5,16);
        list.remove(2);
        System.out.println(list);
    }
}