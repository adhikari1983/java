/*
Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
 */
package class21polymorphism.Task;

public class Student {
    String name;
    String id;
    int batch;

    public Student(String name, String id, int batch) {
        this.name = name;
        this.id = id;
        this.batch = batch;
    }

    void printInfo() {
        System.out.println(name + " " + id + " " + batch);
    }

    void study() {
        System.out.println("Student study all the time.");
    }

    void attendClass() {
        System.out.println("Students are attending the class.");
    }

    void submitAssignment() {
        System.out.println("Students are submitting an assignment.");

    }

}

class SyntaxStudent extends Student {

    public SyntaxStudent(String name, String id, int batch) {
        super(name, id, batch);
    }

    @Override
    void study() {
        System.out.println("Syntax students are studying.");
    }

    @Override
    void attendClass() {
        System.out.println("Syntax are attending the class.");
    }

    @Override
    void submitAssignment() {
        System.out.println("Syntax are submitting an assignment.");

    }

    void marketing() {
        System.out.println("Syntax graduates are in the market for job.");
    }
}


class CollegeStudent extends Student{

    public CollegeStudent(String name, String id, int batch) {
        super(name, id, batch);
    }

    @Override
    void study() {
        System.out.println("College students are studying.");
    }

    @Override
    void attendClass() {
        System.out.println("College are attending the class.");
    }

    @Override
    void submitAssignment() {
        System.out.println("College are submitting an assignment.");

    }

    void eligibility(){
        System.out.println("To admit in college you need high school degree.");
    }
}
class SchoolStudent extends Student{

    public SchoolStudent(String name, String id, int batch) {
        super(name, id, batch);
    }

    @Override
    void study() {
        System.out.println("School students are studying.");
    }

    @Override
    void attendClass() {
        System.out.println("School are attending the class.");
    }

    @Override
    void submitAssignment() {
        System.out.println("School are submitting an assignment.");

    }

    void wearUniform(){
        System.out.println("School students are wearing the school uniform.");
    }
}
