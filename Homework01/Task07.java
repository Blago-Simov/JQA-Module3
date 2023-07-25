package Homework01;

public class Task07 {
    public static void printNumbersInSpecificRange(){

        for (int i = 1 ; i <= 100; i++){

            if(i>=54 && i <=74){
                continue;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args){

        printNumbersInSpecificRange();

    }
}
