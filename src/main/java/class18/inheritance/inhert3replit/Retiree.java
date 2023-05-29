package class18.inheritance.inhert3replit;

public class Retiree extends Student {
    String seniorActivity;

    Retiree(String name, String lastName, int age, int salary, int grade, String seniorActivity) {
        super(name, lastName, age, salary, grade);
        this.seniorActivity = seniorActivity;
    }


    void printRetireeInfo() {
        System.out.println(name + " " + lastName + " " + age + " " + seniorActivity);
    }
}
