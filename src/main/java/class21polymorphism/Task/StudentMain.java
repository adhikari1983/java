package class21polymorphism.Task;

public class StudentMain {
    public static void main(String[] args) {
        //SyntaxStudent, CollegeStudent, SchoolStudent.

        Student[] students = {
                new SyntaxStudent("Ram", "123syntax456", 16),
                new CollegeStudent("Hari", "123college456", 20),
                new SchoolStudent("Jack", "123school456", 12)
        };

        for (Student student : students) {
            if (student instanceof SyntaxStudent) {
                ((SyntaxStudent) student).marketing();       // marketing() is available in the SyntaxStudent class
            } else if (student instanceof CollegeStudent) {
                ((CollegeStudent) student).eligibility();    //eligibility() is available in the SyntaxStudent class
            } else if (student instanceof SchoolStudent) {
                ((SchoolStudent) student).wearUniform();     // wearUniform() is available in the SyntaxStudent class
            }

            student.printInfo();
            student.study();
            student.attendClass();
            student.submitAssignment();
        }

        System.out.println();


        Student student1 = new SyntaxStudent("Ram", "123syntax456", 16);
        ((SyntaxStudent) student1).marketing();


        Student student2 = new CollegeStudent("Hari", "123college456", 20);
        ((CollegeStudent) student2).eligibility();


        Student student3 = new SchoolStudent("Jack", "123school456", 12);
        ((SchoolStudent) student3).wearUniform();


        //<<<<<<<<<<<<<<<<<<<< w/o if(student4 instanceof SchoolStudent) >>>>>>>>>>>>>>>>>>
        //Exception in thread "main" java.lang.ClassCastException: class class21.Task.CollegeStudent cannot be cast to
        // class class21.Task.SchoolStudent
        Student student4 = new CollegeStudent("Hari", "123college456", 20);
        if (student4 instanceof SchoolStudent) {
            ((SchoolStudent) student4).wearUniform();
        } else {
            System.out.println("Type casting is not possible");
        }
    }


}
