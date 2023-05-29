package class20overriding.overloadingrules;

public class Rules {

    void playInstrument() {
        System.out.println("Plays guitar");
    }

    private void accessStage() {         // can't be overridden -> coz of the private, it is just private behaviour
        System.out.println("Accessing the stage");  //...for this class only
    }

    static void printNumber(){          // can't be overridden -> coz this not instance method
        System.out.println(10);         // ....simply static method are not allow to over-ride
    }
}

class Axel extends Rules {
    @Override
    void playInstrument() {
        System.out.println("Plays drum");
    }

    private void accessStage() {
        System.out.println("Accessing the stage");
    }

    //@Override
    static void printNumber(){                // is not overridden from parent
        System.out.println(10);               // it is just a another method for this class
    }
}

class ParentTester {
    public static void main(String[] args) {
        Axel axel = new Axel();
        axel.playInstrument();

    }
}