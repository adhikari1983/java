package class4ifelseif.conditional.st;

public class E1IfElseStatement {
    public static void main(String[] args) {
        boolean hungry = true;
        if (hungry) {
            System.out.println("Let eat something. ");
        } else {
            System.out.println("Lets go for walk. ");
        }

        //String is non-primitive data type, and with non-primitive  we can't use
        //any relational operators for to manipulate
        String  name = "Hari";
        //if(name == "Hari"){    => by default this condition is always false
        if(name.equals("Hari")){
            System.out.println("Hari likes watching movies.");
        }
        else{
            System.out.println("Hari likes programming");
        }
    }
}
