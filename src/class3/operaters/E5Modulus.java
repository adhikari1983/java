package class3.operaters;

public class E5Modulus {
    public static void main(String[] args) {
        int number1 = 11;
        int number2 = 4;
        int remainder = number1 % number2;

        System.out.println(10 % 20); // coz 10 is not divisible by 20 so 10 so, obviously 10 is remainder.
        System.out.println(number1 % number2);
        System.out.println(remainder);

        int noOfPizzaSlices = 3;
        int noOfIndividuals = 2 ;
        System.out.println(noOfPizzaSlices / noOfIndividuals);
        System.out.println(noOfPizzaSlices % noOfIndividuals);
        // e.g. of %  to find to the even number , find the multiple of number num % == 0;

    }
}
