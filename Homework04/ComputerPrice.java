package Homework04;


public class ComputerPrice {
    public static void main(String[] args) {

        Computer a = new Computer();
        a.price = 287.99;
        a.year = 2005;
        a.operationSystem = "Windows7";
        Computer b = new Computer(2015,234.78,"Linux");

        System.out.println("Result of comparing is: "+a.comparePrice(b));


    }
}
