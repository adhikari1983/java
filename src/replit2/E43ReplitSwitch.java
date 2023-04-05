package replit2;

import java.util.Scanner;

public class E43ReplitSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your favorite car make");
        String carOrigin = scanner.next();

        String car = " ";
        switch (carOrigin) {
            case "BMW":
                car = "german car";
                break;
            case "Toyota":
                car = "japanese car";
                break;
            case "Maserati":
                car = "italian car";
                break;
            default:
               car = "unknown";
                break;
        }
        System.out.println("Your favorite car is " + car);
    }
}
