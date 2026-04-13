import java.util.Scanner;

public class Practice17 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int original = num;
        int reverse = 0;

        while (num>0) {
            int lastDgt = num%10;
            reverse = reverse*10+lastDgt;
            num = num/10;
            
        }
        if(original==reverse){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
        // System.out.println(reverse);
    }
}