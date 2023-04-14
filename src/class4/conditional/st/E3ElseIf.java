package class4.conditional.st;

public class E3ElseIf {
    public static void main(String[] args) {
        int day = 1;
        if(day == 1){
            System.out.println("Today is Sunday.");
        }else if(day == 2){
            System.out.println("Today is Monday.");
        }else if(day == 3){
            System.out.println("Today is Tuesday.");
        }//..................... till Saturday.
        else{
            System.out.println("Invalid Input.");
        }

        String fruitName = "Pears";
        if(fruitName.equals("Orange")){
            System.out.println("your order amount is $5 ");
        }else if (fruitName.equals("Apple")){
            System.out.println("your order amount is $10");
        }else if(fruitName.equals("Pears")){
            System.out.println("your order amount is $15");
        }else{
            System.out.println("This fruit is not available");




        }
    }
}
