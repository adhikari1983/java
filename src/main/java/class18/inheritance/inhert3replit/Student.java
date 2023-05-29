package class18.inheritance.inhert3replit;

public class Student extends Employee {
    int grade;

    Student(String name, String lastName, int age, int salary, int grade) {
        super(name, lastName, age, salary);
        this.grade = grade;
    }

    void printStudentInfo() {
        System.out.println(name + " " + lastName + " " + age + " " + grade);
    }
}
