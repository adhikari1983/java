package class21;

public class ArrayRefresher {
    public static void main(String[] args) {
        int[] array = {1,1,1,1,1,1,1};

        String[] names = {"Vlad", "Marina", "Ram", "Sita"};

        String[] namess = {new String("Vlad"), new String("Marina"),
                                         new String("Ram"), new String("Sita")};

        for (int i = 0; i < array.length; i++) {  //
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for(String name: names){
            System.out.print(name + " ");
            System.out.print(name.length() + " ");
        }

        System.out.println();

        Dog dog1 = new Dog("Bravo", "Black", "American");
        Dog[] dogs = {dog1, new Dog("Hari", "Brown", "Asian")};

       // Dog d = dogs[0];    -> instead of getting one by one index and print it  ----===>>> use loop like below
       // d.printInfo();

        for (int i = 0; i < dogs.length; i++) {
            dogs[i].printInfo();
        }
        System.out.println();

        for(Dog dog: dogs){
            dog.printInfo();
        }
    }
}
