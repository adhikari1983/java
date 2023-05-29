package class16.access.modifier.dog;

public class E1Dog {
    String name;
    String color;
    String breed;

    static int age;

    void bark(){
        System.out.println( name  + " is barking. ");
    }

    void printInfo(){
        if(breed.equals("German")){
            System.out.println(name + " " + color + " i can work in NYPD");
        }else{
            System.out.println(name + " can be as Pet. ");
        }
    }

 /*
 QUESTION: So static method are specific to that same class where the method is ?
          -> Yes, that's correct. Static methods are associated with the class in which they are defined,
          rather than with any particular instance of the class.
 */

    static void printInfo2(){                    // instance variables can't be used inside "static-method"
        if(age <10){                             // it is not affected by instance of any class that we create.
            System.out.println("Young dog.");
        }else{                                  // can't use name, breed, color -> instance variable here
            System.out.println("Old dog.");     // coz they get changed according to diff no. of object creation. down the road
        }
    }
}

/*
QUESTION: Is it like, to keep the same behaviour for all the instance we create static method ?
        -> Yes, you can use static methods to define behavior that should be consistent across all instances of a class.
           Because static methods are associated with the class itself, rather than with any particular instance of
           the class, the behavior defined by a static method will be the same for all instances of the class.

        -> e.g.  methods available in String class. Like methods, we can access with String  name;
                 like name.toUppercase()
                      name.toLowercase()
                      name.isEmpty()
                      name.isBlank()
                      name.length()

       In general, it's a good practice to only make methods public if they need to be accessed from outside the class,
       and to only make methods static if they don't depend on the state of an object.
 */