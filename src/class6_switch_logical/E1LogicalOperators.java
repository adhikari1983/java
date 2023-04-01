package class6_switch_logical;

public class E1LogicalOperators {
    public static void main(String[] args) {
        boolean chocolates = true;
        boolean flowers = false;
        if(chocolates || flowers){
            System.out.println("Kids are happy.");
        }else{
            System.out.println("Kids are sad");
        }
        boolean fiveG = false;
        boolean wifi = false;
        if(fiveG || wifi){
            System.out.println("Internet service is available");
        }else{
            System.out.println("Internet service is not available");
        }
    }
}
