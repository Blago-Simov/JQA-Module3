package Homework05;

public class Person {
    String name;
    int age;
    String gender;

    Person(String name,int age,String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public  void showPersonInfo(){
        System.out.println("The name of person is: " + name);
        System.out.println();
        System.out.println("The age of person is: " + age);
        System.out.println();
        System.out.println("The gender of person is: " + gender);
        System.out.println();

    }

}
