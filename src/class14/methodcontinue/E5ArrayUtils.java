package class14.methodcontinue;

public class E5ArrayUtils {

    /*boolean contains(int[] arr, int a){
        for (int i = 0; i < arr.length ; i++) {    //without boolean flag  variable
            if(arr[i] == a)
            return  true;                          // first exit point
        }
        return false;                              // second exit point
    }*/// ____________________________________________________________________________________________________________
                                                    // exit point = no.s of return statement, is that what you mean
    boolean contains(int[] arr, int a){
        boolean isFound = false;                     //good practice to use boolean flag variable, & also for debugging2
        for (int i = 0; i < arr.length ; i++) {      // to maintain the exit points -> here
            if(arr[i] == a)                          // always have one exit point
               isFound = true;
        }
        return isFound;                                // only one exit point, coz of  boolean flag variable "isFound"
    }


    public static void main(String[] args) {
        int[] number = {10, 20, 45};
        int num = 20;
        E5ArrayUtils obj = new E5ArrayUtils();

        System.out.println("Given array : ");
        for (int i : number) {
            System.out.print(i + " ");
        }
        System.out.println("\nNumber to check : " + num);

        boolean result = obj.contains(number, num);
        System.out.println("result = " + result);
    }

}
