package class24.list;

import java.util.ArrayList;

public class E2ArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(100);
        numbers.add(200);
        numbers.add(222);
        System.out.println("numbers = " + numbers);


        System.out.println(numbers.indexOf(100));
        System.out.println(numbers.contains(200));
        System.out.println(numbers.isEmpty());

        System.out.println(numbers.set(4, 333));      // replaces the number at specified index
        System.out.println("numbers = " + numbers);


        //enhanced for
        for(Integer num:numbers){
            System.out.println(num);
        }
        System.out.println("....................................");

        // for i index
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();

        //while loop
        int i=0;
        while(i< numbers.size()){
            System.out.print(numbers.get(i) + " ");
            i++;
        }

        System.out.println();

        //do while loop
        int j = 0;
        do{
            System.out.print(numbers.get(j) + " ");
            j++;
        }while(j< numbers.size());



    }
}
