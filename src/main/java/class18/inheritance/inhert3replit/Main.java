package class18.inheritance.inhert3replit;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Joe", "Smith",35,35000);
        Student student = new Student("Adam", "Smith", 15, 0,10);
        Retiree retiree = new Retiree("Frank", "Smith", 15, 0,0,"tour");

        employee.printEmployeeInfo();
        student.printStudentInfo();
        retiree.printRetireeInfo();
    }
}
