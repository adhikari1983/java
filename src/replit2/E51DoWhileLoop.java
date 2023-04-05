/*
Using do while loop print numbers from 10 to 20
Must not include the number 20 in the output
 */
package replit2;

public class E51DoWhileLoop {
    public static void main(String[] args) {
        int number = 20;
        do{
            if(number%2 == 0){
                System.out.println(number);
            }
            number--;
        }while(number >= 1);

    }
}
