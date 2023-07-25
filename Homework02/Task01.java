package Homework02;

import java.util.Scanner;

public class Task01 {
    static double SumOfTwoNumbers(double firstNumber,double secondNumber){

        double sumResult = 0.0;
        sumResult = firstNumber + secondNumber;
        return  sumResult;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the first number");
        double numberOne = Double.parseDouble(sc.nextLine());

        System.out.println("Please enter the second number");
        double numberTwo = Double.parseDouble(sc.nextLine());
        System.out.println();
        System.out.println("The sum of numbers is: " + SumOfTwoNumbers(numberOne,numberTwo));
    }
}

