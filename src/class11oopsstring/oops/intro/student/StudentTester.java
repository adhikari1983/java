package class11oopsstring.oops.intro.student;

public class StudentTester {
    public static void main(String[] args) {
        Student studentKiran = new Student();

        // accessing the properties/fields/ attributes
        String name = studentKiran.name;
        System.out.println("name = " + name);

        long id = studentKiran.Id;
        System.out.println("id = " + id);

        int age = studentKiran.age;
        System.out.println("age = " + age);

        char grade = studentKiran.grade;
        System.out.println("grade = " + grade);

        double weight = studentKiran.weight;
        System.out.println("weight = " + weight);

        //accessing the functions/methods/behaviours
        studentKiran.sleep();
        studentKiran.walk();
        studentKiran.study();
    }
}
