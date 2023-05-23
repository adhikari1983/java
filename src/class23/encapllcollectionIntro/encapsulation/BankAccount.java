package class23.encapllcollectionIntro.encapsulation;

public class BankAccount {

    private String userName;                 // can't do nothing about username
    private String password;                 // can change the name only
    private double accountBalance = 12000;   // can get the balance and change the balance

    public BankAccount(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public double getAccountBalance(String password){
        if(password.equals(this.password)){
            return accountBalance;
        }else{
            return 0;
        }
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    /** this setter method can be optional just to mention that all method doesn't need to have
       mandatory setter , same goes for getter too.*/
    public void setPassword(String password){
        this.password = password;
    }
}
class BankTester{
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("abc123", "123pass");
        double accountBalance = bankAccount.getAccountBalance("123pass");

        System.out.println("Account Balance = " + accountBalance);

        bankAccount.setAccountBalance(200000);
        System.out.println("New account balance = " + bankAccount.getAccountBalance("123pass"));
    }
}