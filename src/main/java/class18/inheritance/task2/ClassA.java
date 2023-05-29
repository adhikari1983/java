package class18.inheritance.task2;

public class ClassA {
   // Write program to inherit class A that has method printF which is static
    // and call or reuse that method into class B

    static void printF(){
        System.out.println("Printing from class A");
    }


    class ClassB extends ClassA{

    }

    public static void main(String[] args) {
        ClassB.printF();
    }
}
