package Homework02;

import java.util.Scanner;

public class Task04 {
    static void printNumbersOfArrayWithForLoop(int[]arrInt){

        for(int k = 0; k < 10; k++){
            System.out.println("The value of index: " + k +" is: "+ arrInt[k]);
        }
    }

    static void printNumbersOfArrayWhileLoop(int[]arrInt){
        int count = 0;
        while(count < arrInt.length){
            System.out.println("The value of index  " + count +" is: " + arrInt[count]);
            count++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] arr = new int[10];

        System.out.println("Please enter the numbers of array!");

        for (int j = 0; j < arr.length; j++){

            arr[j] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Printing numbers of array whit for loop:");
        printNumbersOfArrayWithForLoop(arr);
        System.out.println();
        System.out.println("Printing numbers of array whit while loop:");
        printNumbersOfArrayWhileLoop(arr);


    }
}
