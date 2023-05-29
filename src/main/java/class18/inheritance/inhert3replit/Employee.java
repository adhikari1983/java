package class18.inheritance.inhert3replit;

public class Employee extends Person {
    int salary;


    Employee(String name, String lastName, int age, int salary) {
        super(name, lastName, age);
        this.salary = salary;
    }

    void printEmployeeInfo() {
        System.out.println(name + " " + lastName + " " + age + " " + salary);
    }
}
