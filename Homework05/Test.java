package Homework05;



public class Test {

    public static void main(String[] args) {

        Person[] people = new Person[10];

        Person a = new Person("John", 35, "Man");
        Person b = new Person("Carie", 28, "Woman");

        Student x = new Student("Bob", 22, "Man",6);
        Student y = new Student("Wendy", 20, "Woman", 5.75);

        Employee emp1 = new Employee("Rick", 28, "Man", 205.44);
        Employee emp2 = new Employee("Victor", 39, "Man", 335.77);

        people[0] = a;
        people[1] = b;
        people[2] = x;
        people[3] = y;
        people[4] = emp1;
        people[5] = emp2;



        for (int i = 0;i< people.length;i++){
            if(people[i] == a){
                a.showPersonInfo();
            } else if (people[i] == b) {
                b.showPersonInfo();
            }else if (people[i] == x) {
                x.showStudentInfo();
            } else if (people[i] == y) {
                y.showStudentInfo();
            } else if (people[i]==emp1) {
                emp1.showEmployeeInfo();
            }else if (people[i] == emp2)
                emp2.showEmployeeInfo();
            }


        System.out.println();
        System.out.println("Employee overtime calculation: ");
