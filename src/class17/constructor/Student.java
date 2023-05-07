package class17.constructor;

public class Student {
    String name;
    String id;

    public Student(String name) {
        this.name = name;
        System.out.println("1 args cnstr");
    }

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        System.out.println("2 args cnstr");
    }

    void printInfo1() {
        System.out.println("Student name is " + name);
    }

    void printInfo2() {
        System.out.println("Student name is " + name + " and id is " + id);
    }
}

