import java.util.Scanner;

public class Test0104 {

    public static void main(String args[]){

        // Test1:
        // int score = 75;
        // char grade = 'B';

        // if (score >=50){
        //     System.out.println("Passed");
        // }else{
        //     System.out.println("Failed");
        // }

        // if(score>=90 && score <=100){
        //     System.out.println("Grade: A");
        // }else if(score >=75 && score <90)
        //     System.out.println("Grade: B");
        // else if(score >=60 && score <75)
        //     System.out.println("Grade: C");
        // else if(score >=0 && score <60)
        //     System.out.println("Grade: D");
        // else
        //     System.out.println("Invalid input");


        // While loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        
        int num =0;
        while(num <x){
            System.out.println(num);
            num++;
        }
    }
}