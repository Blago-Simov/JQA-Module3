package Homework03;

import java.util.Scanner;

public class CarPerson {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Car bmw = new Car(2020,34500,true,
                55.00,44.00,"gasoline");
        Car volvo = new Car(2018,25000,false,
                45.00,45.00,"diesel");

        System.out.println("Please enter the fuel that you spent!");
        double spentFuel = Double.parseDouble(sc.nextLine());
        System.out.println();
        volvo.useFuel(spentFuel);
        System.out.println("Please enter the engine that you choose!");
        String typeOfEngine = sc.nextLine();
        bmw.changeFuelOperationSystem(typeOfEngine);
        System.out.println();
        System.out.println("Parameters of first car: ");
        bmw.printCarProperties();
        System.out.println();
        System.out.println("Parameters of second car: ");
        volvo.printCarProperties();
    }
}
