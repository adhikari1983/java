package class3.operaters;

public class E6StringConcat {
    public static void main(String[] args) {
        String firstName = "Nitesh";
        String secondName = "Drinkwater";

        String fullName = firstName + secondName; // only "+" does to concatenate.
        System.out.println(fullName);

        String playerNumber = firstName + 10;   // string = string + int/shot/byte/long/float/double
        System.out.println(playerNumber);        //result playerNumber is always string

    }
}

