package class22.interfaceinfo;

public interface MyInterface {
    // Constant declaration
    int MAX_VALUE = 100;

    // Method signature
    void doSomething();

    // Default method
    /*
        If you do not include the default keyword when defining a method in an interface, then the method will be
        considered an abstract method and any class that implements the interface will be required to provide an
        implementation for that method.
    */
    default void doSomethingElse() {
        System.out.println("Doing something else...");
    }

    // Static method
    static void printMaxValue() {
        System.out.println("Max value is: " + MAX_VALUE);
    }
}

// Example class that implements the MyInterface interface
class MyClass implements MyInterface {
    @Override
    public void doSomething() {
        System.out.println("Doing something...");
    }
}

// Example usage of the MyInterface interface and MyClass
class MyInterfaceTester {
    public static void main(String[] args) {
        MyInterface myClass = new MyClass();

        // Accessing constant value from the interface
        System.out.println("Max value is: " + MyInterface.MAX_VALUE);

        // Calling method from the interface
        myClass.doSomething();

        // Calling default method from the interface
        myClass.doSomethingElse();

        // Calling static method from the interface
        MyInterface.printMaxValue();
    }
}
