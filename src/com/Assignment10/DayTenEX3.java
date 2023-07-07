package com.Assignment10;

public class DayTenEX4 {
    public static void main(String[] args) {
        int[]array = {4,5,3,10,8,9};
        // System.out.println("LARGEST NO");

        int smallest =array[0];
        for(int i=0;i<array.length;i++){
            if (array[i] < smallest){
                smallest = array[i];
            }

        }
        System.out.println("The smallest elment in array is ::" +smallest);
    }
}
