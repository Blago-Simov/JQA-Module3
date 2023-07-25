package Homework03;

public class Car {

    int year = 0;
    double price = 0.0;
    boolean isSportCar = true;
    double fuelTankCapacity = 0.0;
    double freeFuel = 0.0;
    String engineFuelOperationSystem = "";

    Car(int year,double price,boolean isSportCar,double fuelTankCapacity,
        double freeFuel,String engineFuelOperationSystem){

        this.year = year;
        this.price = price;
        this.isSportCar = isSportCar;
        this.fuelTankCapacity = fuelTankCapacity;
        this.freeFuel = freeFuel;
        this.engineFuelOperationSystem = engineFuelOperationSystem;

    }

    public void changeFuelOperationSystem(String newFuelOperationSystem){
        engineFuelOperationSystem = newFuelOperationSystem;
    }
    public  void useFuel(double fuel){
        if (fuel > freeFuel){
            System.out.println("Not enough free fuel!");
            System.out.println("Free fuel will be set to amount of given fuel!");
            freeFuel = fuel;
        }else {
            freeFuel-=fuel;
        }
    }

    public  void printCarProperties(){

        System.out.println("Year of production: " + year );
        System.out.println();
        System.out.println("Car price: " + price );
        System.out.println();
        System.out.println("Sport car: " + isSportCar );
        System.out.println();
        System.out.println("Fuel tank capacity: " + fuelTankCapacity );
        System.out.println();
        System.out.println("Free fuel left: " + freeFuel );
        System.out.println();
        System.out.println("Engine fuel system: " + engineFuelOperationSystem );
        System.out.println();


    }

}
