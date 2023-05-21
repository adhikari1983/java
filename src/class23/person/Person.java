package class23.person;

public interface Person {
    void eat();
}

/** Inheritance concept Interface can extend Interface => don't get confuse w/implements term here please..........*/
interface Employee extends Person{
    void work();
}


class Tester implements Employee{

    @Override
    public void eat() {
        System.out.println("Tester tests the application");
    }

    @Override
    public void work() {
        System.out.println("tester make developers work harder");
    }
}