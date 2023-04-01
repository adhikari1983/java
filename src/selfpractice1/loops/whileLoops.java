package selfpractice1.loops;

public class whileLoops {
    public static void main(String[] args) {

        int i = 1;

        while(i < 3){                             //checks the condition before
            System.out.println("Hello World");
            i++;
        }

        do {
            System.out.println("I going for running.");
        }while (i == 1);                           //checks the condition after
    }
}

