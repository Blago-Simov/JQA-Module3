package Homework01;

public class Task05 {
    public static void printNumbersToHundredInAscAndDescOrder() {

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
        System.out.println();

        for(int j = 100; j >=1; j--) {
            System.out.println(j);
        }
    }

    public static void main(String[] args){

        printNumbersToHundredInAscAndDescOrder();


    }
}
