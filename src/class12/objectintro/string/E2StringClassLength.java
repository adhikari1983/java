package class12.objectintro.string;

public class E2StringClassLength {
    public static void main(String[] args) {
        String userName = "admin";
        String password = "pass123";

        if(userName.length() < 8 && password.length() < 8){
            System.out.println("Signup Successful. ");
        }else{
            System.out.println("Username and Password can't be more than 8 character");
        }

    }
}
