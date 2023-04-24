package class13.stringcontinues;

public class E3StringReplaceAllRegex {
    public static void main(String[] args) {
        String str="ksnfksnDSKJDSDJ1232344@#$%^&*";

        // if we don't provide any replacement it will remove that range e.g.[a-z]
        System.out.println(str.replaceAll("[a-z]", ""));

        //carrot sign ->   { ^ equivalent to ! operator }
        //do not replace lower case letter from a-z / number from 0-9
        System.out.println(str.replaceAll("[^a-z0-9]", ""));

        // ! -> it will not works regex like java / it means different in here
        //coz regex is different language from java
        System.out.println(str.replaceAll("[!a-z0-9]", ""));

        //$ -> sign is bit special to do
        System.out.println(str.replaceAll("[A-Z]", "\\$"));

        System.out.println(str.replaceAll("[Dn3]", ""));
        System.out.println(str.replaceAll("[Dn3]", "\\$"));

        System.out.println(str.replaceAll("", "\\$"));





    }
}
