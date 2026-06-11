import java.util.Scanner;

public class Practice46 {

    public static void main(String args[]){
        // System.out.println("Hello World!!!");
        // System.out.println("Code to Reverse the string");
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the string you want to reverse");
        // String name = sc.nextLine();
        // String rev = "";
        // // System.out.println(name.charAt(2));
        // // System.out.println(name.length());
        // int len = name.length();
        // for(int i = len-1;i>=0;i--){
        //     rev = rev+name.charAt(i);
        // }
        // // System.out.println(rev);
        // // System.out.println(rev.toUpperCase());

        // System.out.println("Input : "+name.toUpperCase());
        // System.out.println("Output : "+rev.toUpperCase());

        // ######################################################


        // Palindrome
        System.out.println("Palindrome");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String or Number");
        String inp = sc.nextLine().toUpperCase();
        String out = "";
        int len = inp.length();
        for(int i=len-1;i>=0;i--){
            out = out+inp.charAt(i);
        }
        if(inp.equals(out)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }

        
    }
}