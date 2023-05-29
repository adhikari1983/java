package class3.operaters;

public class E10TypeCasting {
    public static void main(String[] args) {
        //byte => short => int => float => double
        byte num = 127;
        short num2 = num;
        //no issues as we are putting something from smaller to a larger box
        System.out.println(num2);
        int num3 = 1111120;
        double num4 = num3;
        System.out.println(num4);//as long as from smaller to bigger box is fine

        //short num5 = 1200;                         short "1 0 1 0 0 0 0 0 1 0 1"  => 1200   // for answer -80
        short num5 = 126;                //when we convert to small size we loose the data from
        byte num6 = (byte)num5;          // binary structure and get -80 like "1 0 1 0 0 0" only
        System.out.println(num6);

    }
}
