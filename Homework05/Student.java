package Homework05;

public class Student extends Person{

    double score;

    Student(String name,int age,String gender,double score){
           super(name,age,gender);
        if(score < 2.0 || score> 6.0){
            throw new IllegalArgumentException();
        }
        this.score = score;
    }

    public void showStudentInfo(){

        System.out.println("The name of student is: "+ name);
        System.out.println();
        System.out.println("The age of student is: "+ age);
        System.out.println();
        System.out.println("The gender of student is: "+ gender);
        System.out.println();
        System.out.println("The score of student is: "+ score);
        System.out.println();

    }
}
