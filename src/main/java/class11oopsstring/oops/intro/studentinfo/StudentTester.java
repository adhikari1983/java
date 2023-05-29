package class11oopsstring.oops.intro.studentinfo;

public class StudentTester {
    // All the classes at we created act as data-type e.g. Student, StudentTester
    public static void main(String[] args) {
        Student[] studentInfo = new Student[5];

        studentInfo[0] = new Student("Sam", 99999, 33, 'A', 141);
        studentInfo[1] = new Student("Ram", 88888, 100, 'B', 142);
        studentInfo[2] = new Student("Jack", 77777, 88, 'C', 143);
        studentInfo[3] = new Student("Harry", 66666, 34, 'D', 144);
        studentInfo[4] = new Student("Kiran", 55555, 83, 'F', 145);

        for (Student info : studentInfo) {
            System.out.println(info);
        }


    }
}
