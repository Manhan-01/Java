import java.util.Scanner;

public class Practice3_LogicalOps {

    public static void main(String args[]){
        

//        getting user input
// to get String input use sc.nextLine(), to get int input use sc.nextInt();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Hello "+name);
        if(age >=0 && age < 18){
            System.out.println("You are underage, Better luck next time!!!");
        }else if(age >= 18){
            System.out.println("Hurray!!!, You are eligible to vote");
        }else{
            System.out.println("Please enter valid input");
        }
    }
}