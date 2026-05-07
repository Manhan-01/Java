import java.util.Scanner;

public class Practice36 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        double d = Math.sqrt(a);
        int n = (int)d;
        System.out.println("Square root of "+a+" is : "+n);
    }
}