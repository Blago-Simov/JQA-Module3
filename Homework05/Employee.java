package Homework05;

public class Employee extends Person{

    double daySalary;

    Employee(String name,int age,String gender,double daySalary){
        super(name, age, gender);
        this.daySalary = daySalary;
    }

    public double calculateOvertime(double hours){
        double overtimeSalary = 0.0;
        if(age < 18){
            overtimeSalary = 0;
        }else{
            overtimeSalary = ((daySalary/8)*1.5)*hours;
        }
        return overtimeSalary;
    }

    public void showEmployeeInfo(){

        System.out.println("The name of employee is: "+ name);
        System.out.println();
        System.out.println("The age of employee is: "+ age);
        System.out.println();
        System.out.println("The gender of employee is: "+ gender);
        System.out.println();
        System.out.println("The salary of employee is: "+ daySalary);
        System.out.println();

    }

}
