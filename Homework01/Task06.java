package Homework01;

import java.util.Scanner;

public class Task06 {
    public static void printDayOfTheWeek(int dayToPrint){

        switch (dayToPrint){
            case 1:
                System.out.println("It is a Monday");
                break;
            case 2:
                System.out.println("It is a Tuesday");
                break;
            case 3:
                System.out.println("It is a Wednesday");
                break;
            case 4:
                System.out.println("It is a Thursday");
                break;
            case 5:
                System.out.println("It is Friday");
                break;
            case 6:
                System.out.println("It is a Saturday");
                break;
            case 7:
                System.out.println("It is a Sunday");
                break;
            default:
                System.out.println("The number is out of range!");
                System.out.println("Please enter a valid number!");

        }

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // The number range has to be between 1 and 7

        System.out.println("Please enter a number: ");
        int number = Integer.parseInt(sc.nextLine());

        printDayOfTheWeek(number);
