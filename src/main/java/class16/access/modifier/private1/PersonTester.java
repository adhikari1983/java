package class16.access.modifier.private1;

public class PersonTester {

    public static void main(String[] args) {
        Person person = new Person();
        //person.password = "kfnskvl";   coz password & printPassword are private instance variable/method
       // person.printPassword();        to Person -> " so then other classes can't interface with it "
                                        //Very sensitive data of -> Person class

        // PersonTester.printBalance();  can't be accessed coz printBalance() -> private to Person Class
    }
}
