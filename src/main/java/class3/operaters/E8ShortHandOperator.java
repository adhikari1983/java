package class3.operaters;

public class E8ShortHandOperator {
    public static void main(String[] args) {
        //to create a container of type int and store the number 10 in it
        int number = 10;

        //pick whatever is stored in number container and add 20 to that value and
        //store the results back to number variable on line 10
        // number = number + 20; //30
        //we are saying java add 20 to the previous value of number variable
        number += 20;
        System.out.println(number);

        int num = 10;
        num += 90; //100
        System.out.println(num);
        num -= 50; //100-50
        System.out.println(num);
        num *= 2; //50*2
        System.out.println(num);

    }
}
