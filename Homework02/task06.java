package Homework02;

public class Task06 {
    public static boolean isEqual(int[] a,int[] b){

        if(a.length != b.length) return false;

        for (int i = 0 ; i < a.length ; i++){
            if(a[i]!= b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int[] arr1 = {1,2,3};

        int[] arr2 = {1,2,3};

        if(isEqual(arr1,arr2)){
            System.out.println("The arrays are the same!");
        }else {
            System.out.println("The arrays are not the same!");
        }

    }
}
