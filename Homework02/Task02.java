package Homework02;

import java.util.Scanner;

public class Task02 {
    static void  printAverageOfTwoNumbers(int firstNumber,int secondNumber){

        int averageResult = 0;
        averageResult = (firstNumber + secondNumber)/2;
        System.out.println("The average of numbers is: " + averageResult);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int firstInteger = Integer.parseInt(sc.nextLine());

        System.out.println("Please enter the second number");
        int secondInteger = Integer.parseInt(sc.nextLine());

        printAverageOfTwoNumbers(firstInteger,secondInteger);
    }
}
