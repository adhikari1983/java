package class19overloading;

public class E1AnimalWhySuper {
    String  name = "Jack";
}

class Dog extends E1AnimalWhySuper{
    String name = "Joke";
    void printName(){
        System.out.println(name);
    }
}
// to avoid the conflict between same name properties or  same name class we explicitly specify with the "super" key