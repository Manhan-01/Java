import java.util.Scanner;

public class Practice57 {

    public static void main(String args[]){
        System.out.println("Welcome to MandyBank ATM");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insert Your Debit Card");
        System.out.println("Press the suitable option");
        System.out.println("A => Inserted");
        System.out.println("B => Not inserted");
        String opt = sc.next().toUpperCase();
        if(opt.equals("A") || opt.equals("B")){
            if(opt.equals("A")){
                System.out.println(opt);
            System.out.println("Enter Password");
            int Password = sc.nextInt();
            if(Password==1234){
                System.out.println("Correct Password");
            }
            else{
                System.out.println("Wrong password");
            }
            }
            else{
                System.out.println("Insert ATM");
            }
            
        }
        else{
            System.out.println("Invalid input");
        }
        // System.out.println(opt);
    }
}