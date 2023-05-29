package class25.setnmap.misc;

import java.util.ArrayList;
import java.util.List;

public class E1ArrayListAmazonExample {
    public static void main(String[] args) {
        List<HeadSets> headSets = new ArrayList<>();
        HeadSets car1 = new HeadSets("Razer Nari Ultimate", 79.99, 4620);
        headSets.add(car1);
        headSets.add(new HeadSets("New Steel Series", 52.64, 4868));
        headSets.add(new HeadSets("HyperX Cloud", 99.99, 4920));
        headSets.add(new HeadSets("SonyX Water", 179.99, 4568));

        printList(headSets);
        /**    EVERY CLASS IN JAVA INHERITS FROM OBJECT CLASS       */
        // method defined in the godfather "OBJECT" class
        // internally invokes from Object class
        headSets.toString();                         // generic to headSets
        System.out.println(car1.toString());         // specific to car
        System.out.println();
}

    public static void printList( List<HeadSets> list){  // created the method just to show that
        for(HeadSets headSet: list){                     // List<HeadSets> list -> can be passed as parameter
            headSet.printInfo();                         //other than that -> no significance of creating it.
        }
    }
}

//creating the headSets class, So then we can create its object & store as data .
//then do the manipulation.
class HeadSets{
    private String title;
    private  double price;
    private  int noOfReviews;

    public HeadSets(String title, double price, int noOfReviews) {
        this.title = title;
        this.price = price;
        this.noOfReviews = noOfReviews;
    }

    public  void printInfo() {
         System.out.println(title + " " + price + " " + noOfReviews);
        //System.out.println(toString());
    }

    //comes from godFather Object class
    @Override
    public String toString() {
        return title + " " + price + " " + noOfReviews;
    }
}