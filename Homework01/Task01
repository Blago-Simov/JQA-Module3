package Homework01;

import java.util.Scanner;

public class Task01 {

    public static void printIsNumberInRange(int start,int end,int between)

    {
        int lowerBound = Math.min(start,end);

        int upperBound = Math.max(start,end);

        if(between>= lowerBound && between<=upperBound) {
            System.out.println("The third number is between first and second numbers !");

        }else {
            System.out.println("The third number is not between first and second numbers !");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your first number:");
        int firstNumber = Integer.parseInt(sc.nextLine());
        System.out.println("Your first number is :" + firstNumber);

        System.out.println("Please enter your second number:");
        int secondNumber = Integer.parseInt(sc.nextLine());
        System.out.println("Your second number is :" + secondNumber);

        System.out.println("Please enter your third number:");
        int thirdNumber = Integer.parseInt(sc.nextLine());
        System.out.println("Your third number is :" + thirdNumber);

        printIsNumberInRange(firstNumber,secondNumber,thirdNumber);


    }
}
