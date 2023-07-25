package Homework02;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lengthOfArray = 5;

        double [] arr  = new double[lengthOfArray];

        System.out.println("Please enter numbers of array!" );

        for (int i = 0 ; i < arr.length; i++){

            arr[i] = Double.parseDouble(sc.nextLine());
        }
        System.out.println();

        for (double v : arr) {

            System.out.println("The numbers of array are: " + v);
        }

    }
}
