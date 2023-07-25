package Homework01;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your first number:");
        int firstNumber = Integer.parseInt(sc.nextLine());
        System.out.println("The value of the first number is:" + firstNumber);

        System.out.println("Please enter your second number:");
        int secondNumber = Integer.parseInt(sc.nextLine());
        System.out.println("The value of the second number is:" + secondNumber);

        System.out.println("Please enter your third number:");
        int thirdNumber = Integer.parseInt(sc.nextLine());
        System.out.println("The value of the third number is:" + thirdNumber);
        System.out.println();

        int oldValueOfFirstNumber;
        oldValueOfFirstNumber = firstNumber;

        System.out.println("After replacing");
        firstNumber = secondNumber;
        System.out.println("The value of the first number is:" + firstNumber);
        System.out.println();
        secondNumber = thirdNumber;
        System.out.println("The value of the second number is:" + secondNumber);
        System.out.println();
        thirdNumber = oldValueOfFirstNumber;
        System.out.println("The value of the third number is:" + thirdNumber);
        System.out.println();

        int sumOfTheFirstTwoNumbers = firstNumber + secondNumber;

        System.out.println("The sum of the first two numbers is: " + sumOfTheFirstTwoNumbers);

        int diffResult = sumOfTheFirstTwoNumbers - thirdNumber;
        System.out.println("The difference between first two numbers and third number is : " + diffResult);
    }
}
