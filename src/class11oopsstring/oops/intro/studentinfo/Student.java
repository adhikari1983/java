package class11oopsstring.oops.intro.studentinfo;

public class Student {
    //properties/fields/attributes -> represents the objects(real life matters/things)
    String name;
    int Id;
    int age;
    char grade;
    int weight;

    public Student(String name, int id, int age, char grade, int weight) {
        this.name = name;
        Id = id;
        this.age = age;
        this.grade = grade;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", age=" + age +
                ", grade=" + grade +
                ", weight=" + weight +
                '}';
    }

    //function/methods/behaviours
    void sleep() {
        System.out.println("Sleep enough hours to refresh the brain.");
    }

    void study() {
        System.out.println("Studying Java programming.");
    }

    void walk() {
        System.out.println("Should have to exercise to maintain health.");
    }
}
