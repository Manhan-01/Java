import java.util.Scanner;

public class Practice3_CondtionalStats {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the current hour");
        int input = sc.nextInt();
        if (input >=0 && input <=12){
            System.out.println("Hey Mandy, Good Morning");
        }else if(input>12 && input <18){
            System.out.println("Good Afternoon Mate");
        }else if(input>18 && input <=24){
            System.out.println("Good night Bro!!!");
        }else{
            System.out.println("Invalid input");
        }
    }
}