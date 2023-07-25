package Homework04;

public class Computer {

    int year = 0;
    double price = 0.0;
    String operationSystem = "";
    //Constrictor with parameters
    Computer(int year, double price, String operationSystem) {

        this.year = year;
        this.price = price;
        this.operationSystem = operationSystem;
    }
    //Constructor without parameters
    Computer() {

    }
    public int comparePrice(Computer compare) {
        int result;
        if (this.price > compare.price) {
            result = -1;
        } else if (this.price < compare.price) {
            result = 1;
        } else {
            result = 0;
        }
        return result;
    }
}
