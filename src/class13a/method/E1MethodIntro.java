package class13a.method;

public class E1MethodIntro {

    void printSomething() {
        System.out.println("Hello Java");
        System.out.println("Hello Java");
        System.out.println("Hello Java");
        System.out.println("Hello Java");
    }

    //method is asking user to input their input as String type
    void printWord(String word){
        System.out.println(word);
    }

    //we are expecting 2-arguments => (String word, int number) to make this method work
    void printWordManyTimes(String word, int number){
        for (int i = 0; i < number; i++) {
            System.out.println(word);
        }
    }
}
