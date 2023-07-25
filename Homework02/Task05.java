package Homework02;

public class Task05 {
    public static void main(String[] args) {

        int [] arr1 = {10,12,1,8,4};

        int [] arr2 = arr1.clone();

        System.out.println("Contents of arr1: ");

        for (int v: arr1) {
            System.out.print(" " + v);
        }

        System.out.println();

        System.out.println("Contents of arr2: " );
        for (int j:arr2) {
            System.out.print(" " + j);
        }
    }
}
