package class13a.method;

public class E1MethodIntroTester {

    public static void main(String[] args) {
//        System.out.println("Hello Java");
//        System.out.println("Hello Java");
//        System.out.println("Hello Java");
//        System.out.println("Hello Java");

        //just create a method and use it
        E1MethodIntro obj = new E1MethodIntro();
        obj.printSomething();

        obj.printWord("Kiran");

        //to which variable they will be copied from corresponding method of main class E1MethodIntro
        //( word: ,  number:  );
        obj.printWordManyTimes("Kripa", 5);
    }
}
