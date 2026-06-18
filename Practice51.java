// import Outer.Inner;

class BankAccount{
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    class Transaction{
        public void deposit(double amount){
            double newBalance = balance + amount;
            balance = newBalance;
            System.out.println("deposited : "+amount);
            System.out.println("Current Balance : "+newBalance);
        }
        public void withdraw(double amount){
            if(amount<=balance){
                double newBalance = balance - amount;
                balance = newBalance;
                System.out.println("Withdrawn : "+amount);
                System.out.println("Current balance : "+newBalance);
            }else{
                System.out.println("Insufficient balance");
            }
        }
    }

    

}

class Outer{
    int cc = 350;
    public void machine(){
        System.out.println("Royal Enfiel Classic 350");
    }
    class Inner{
        public void model(){
            System.out.println("Stealth Black.");
        }
    }
}

public class Practice51 {

    public static void main(String args[]){
        // Outer outer = new Outer();
        // outer.machine();
        // System.out.println(outer.cc);

        // // Accessing the inner class
        // Outer.Inner inner = outer.new Inner();
        // inner.model();

        BankAccount acc = new BankAccount("ABC123", "Mandy", 10000);
        // System.out.println(acc.accountHolderName);
        // acc.deposit(2000);
        BankAccount.Transaction transaction = acc.new Transaction();
        transaction.deposit(5000);
        transaction.withdraw(3000);
        transaction.withdraw(40000);



    }
}