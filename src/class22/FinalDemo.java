package class22;

public class FinalDemo {
    final String SSN;

    public FinalDemo(String SSN) {
        this.SSN = SSN;
    }

    void changePassword(){
        //not allowed as value will be assigned already in constructor
        //SSN = "";    coz,  can't change it once you declare with final , it will be mentioned already in cnstr.
    }
}
