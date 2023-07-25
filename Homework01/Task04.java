package Homework01;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter whether is day off: ");
        boolean isDayOff = sc.nextBoolean();

        System.out.println("Enter amount of money: ");
        double amountOfMoney = Double.parseDouble(sc.nextLine());

        System.out.println("Enter the working hours: ");
        int workingHours = Integer.parseInt(sc.nextLine());


        if(isDayOff) {
            workingHours = 0;
            System.out.println("My working hours are: " + workingHours);

            if(amountOfMoney == 0) {
                System.out.println("I will stay in home and I will watch Tv!");

            } else if (amountOfMoney < 10) {
                System.out.println("I will buy an ice cream!");
            }else {
                System.out.println("I will go to cinema!");
            }

        }

        if(!isDayOff) {
            System.out.println("I will go to work!");

            if(workingHours > 8) {
                System.out.println("I will work: " + workingHours/8 + " days");

            }else {
                System.out.println("I'm going to ask my boss to give me extra work!");
            }
        }

    }
}
