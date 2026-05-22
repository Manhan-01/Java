// abstract

import java.util.Scanner;

abstract class Bank{
    String customerName;
    int CRAmt;
    int DRAmt;
    double P;
    double T;
    double R;
    

    public void createAcc(){
        System.out.println("Congratulations "+customerName+", Your account created. ");
    }

    public void creditAmt(){
        System.out.println("₹"+CRAmt+"Credited into your account");
    }
    public void debitAmt(){
         System.out.println("₹"+DRAmt+"Debited froum your account");
    }
    public abstract void FD(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Confirm if you are interested in FD");
        System.out.println("Yes/No");
        String FDConfirm = sc.nextLine();
        if(FDConfirm.equals("Yes")){
            System.out.println("Enter Principal amount");
            double P = sc.nextDouble();
            System.out.println("Enter Period in Years");
            double T = sc.nextDouble();
            double intRate = ((P*T*R)/100);
            System.out.println(intRate);

        }
    }

}
class SBI extends Bank{
    public FD(){
        R = 7.5;
    }
    
}


public class Practice43 {

    public static void main(String args[]){

        Bank c1 = new SBI();
        c1.customerName = "Mandy";
        c1.createAcc();

    }
}