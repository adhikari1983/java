package selfpractice1.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        String sentence = "I am Learning the Java programming";
        Scanner scanner = new Scanner(sentence);
        List<String> arrayList = new ArrayList<>();

        while(scanner.hasNext()){
            // String value = scanner.next();
            //arrayList.add(value);
            arrayList.add(scanner.next());
        }
        System.out.println(arrayList);
    }
}
