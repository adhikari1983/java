package class16.access.modifier.private1;

import java.util.Scanner;

public class Person {
    private  String password;

    static double bankBalance = 120000.01235;

    private  void printPassword(){
        System.out.println(password);
    }


    private  static void printBalance(){
        System.out.println(bankBalance);
    }


    public static void main(String[] args) {
        Person kiran = new Person();
        kiran.password = "ls164325897gfiohvk";
        kiran.printPassword();

        System.out.println(Person.bankBalance);


    }
}
