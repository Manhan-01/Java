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
        // System.out.println("Palindrome");
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a String or Number");
        // String inp = sc.nextLine().toUpperCase();
        // String out = "";
        // int len = inp.length();
        // for(int i=len-1;i>=0;i--){
        //     out = out+inp.charAt(i);
        // }
        // if(inp.equals(out)){
        //     System.out.println("Palindrome");
        // }else{
        //     System.out.println("Not a Palindrome");
        // }

        // ############################################################


        // Finding the duplicate characters
        // System.out.println("Finding the duplicate characters");
        // String str = "Mahantesh";
        // for(int i=0;i<str.length();i++){
        //     for(int j=i;j<str.length();j++){
        //         if(str.charAt(i).equals(str.charAt(j))){

        //         }
        //             }


        // #############################################################



        // Largest and Smallest Number
        System.out.println("Largest and Smallest Number");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of inputs");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the numbers below : ");
        for(int j=0;j<n;j++){
            numbers[j] = sc.nextInt();
        }
        // int numbers[] = {23,54,63,26,82,15};
        int smallest = numbers[0];
        int Largest = numbers[0];
        
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>Largest){
                Largest = numbers[i];
            }else if(numbers[i]<smallest){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest : "+smallest);
        System.out.println("Largest : "+Largest);
        
    }
}