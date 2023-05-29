package class24.list;

import java.util.ArrayList;

public class T4ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 2; i <500; i+=2) {
            if(i%2 == 0){
                numbers.add(i);
            }

            numbers.removeIf(x -> x%5 ==0);
        }
        System.out.println(numbers);
    }
}
