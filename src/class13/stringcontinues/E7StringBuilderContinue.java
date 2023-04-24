package class13.stringcontinues;

public class E7StringBuilderContinue {
    public static void main(String[] args) {

        //behind the scene 3-memory cells  gets allocated on 3-diff variable
        // doesn't waste memory
        // can't mute at all
        String name = "Kiran";
        String name1 = "Kripa";
        String name3 = "Son";

        // store on 1-memory cell with diff variable
        String country1 = "USA";
        String country2 = "USA";
        String country3 = "USA";


        //creates 3-memory cell with diff variable
        //it will waste memory
        // main purpose to mute
        StringBuilder country4 = new StringBuilder("USA");
        StringBuilder country5 = new StringBuilder("USA");
        StringBuilder country6 = new StringBuilder("USA");
    }
}
