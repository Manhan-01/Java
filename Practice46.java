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
        // System.out.println("Largest and Smallest Number");
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of inputs");
        // int n = sc.nextInt();
        // int[] numbers = new int[n];
        // System.out.println("Enter the numbers below : ");
        // for(int j=0;j<n;j++){
        //     numbers[j] = sc.nextInt();
        // }
        // // int numbers[] = {23,54,63,26,82,15};
        // int smallest = numbers[0];
        // int Largest = numbers[0];
        
        // for(int i=0;i<numbers.length;i++){
        //     if(numbers[i]>Largest){
        //         Largest = numbers[i];
        //     }else if(numbers[i]<smallest){
        //         smallest = numbers[i];
        //     }
        // }
        // System.out.println("Smallest : "+smallest);
        // System.out.println("Largest : "+Largest);
        // ####################################################################



        // Finding the missing number ==> Yet to complete
        // int[] numbers = {1,2,3,5,6};
        // int start = numbers[0];
        // int end = numbers[numbers.length-1];
        // int add;

        // for(int i=start;i<=end;i++){
        //     add = add+numbers[i];
        // }

        // ###################################################################



        // Remove Duplicate numbers 
        // int numbers[] = {1,2,2,3,4,5,6,6,6,7};
        // System.out.println(numbers.length);
        // int result[] = new int[numbers.length];
        // result[0] = numbers[0];
        // int rd=0;
        // for(int i=1;i<numbers.length;i++){
        //     if(numbers[i]!=result[rd]){
        //         rd++;
        //         result[rd] = numbers[i];
        //     }
        // }
        // for(int n : result){
        //     System.out.print(n+" ");
        // }

        // **Alternative way to save time complexity
        // int numbers[] = {1,2,3,3,4,5,5,5,6,7,8};
        // int temp[] = new int[numbers.length];
        // int rd = 0;
        // for(int i=1;i<numbers.length;i++){
        //     if(numbers[rd] != numbers[i]){
        //         rd++;
        //         numbers[rd] = numbers[i];
        //     }
        // }
        // for(int j:numbers){
        //     System.out.print(j+" ");
        // }

        // #########################################################


        // Rotate Array by k position
        // int[] numbers = {1,2,3,4,5};
        // int temp = numbers[0];
        // for(int i=1;i<numbers.length;i++){
        //     numbers[i-1] = numbers[i];
        // }
        // numbers[numbers.length-1] = temp;

        // for(int a : numbers){
        //     System.out.print(a+" ");
        // }


        // ***********
        // int[] a = {1,2,3,4,5};
        // for(int i=0;i<a.length;i++){
        //     System.out.print(a[i]+" ");
        // }        
        // System.out.println();
        // rotateAnArray(a);
        // for(int i=0;i<a.length;i++){
        //     System.out.print(a[i]+" ");
        // }

        // *******************

        int[] numbers = {10,20,30,40,50,60,70};
        int n = numbers.length-1;
        int k = 3;
        int[] rev = new int[n+1];
        

        // STEP 1 : Reverse the array
        for(int i=n;i>=0;i--){
            rev[n-i] = numbers[i];
        }
        System.out.println("Step 1: Reverse the array");
        for(int a : rev){
            System.out.print(a+" ");
        }
        

        // STEP 2 : reverse first K elements in reversed array
        int left = 0;
        int right = k-1;
        while(left<right){
            int temp = rev[left];
            rev[left] = rev[right];
            rev[right] = temp;

            left++;
            right--;
        }
        System.out.println();
        System.out.println("Step 2: reverse first k elemts");
        for(int i: rev){
            System.out.print(i+" ");
        }

        // STEP 3: reverse the elements from k to n;
        while (k<n) {
            int temp2 = rev[k];
            rev[k] = rev[n];
            rev[n] = temp2;

            k++;
            n--;
            
        }
        System.out.println();

        System.out.println();
        System.out.println("step 3: final output");
        for(int i: rev){
            System.out.print(i+" ");
        }




    }
}