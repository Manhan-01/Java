import java.util.Scanner;

public class Practice15 {

    public static void main(String args[]){
        // int values[] = {2,6,3,7,9};
        // System.out.println(values[2]);

        // values[2] = 19;
        // System.out.println(values[2]);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of entries : ");
        int size = sc.nextInt();
        String[] names = new String[size];
        int[] marks = new int[size];
        sc.nextLine(); //this consumes new line

        for(int i=0;i<size;i++){
            System.out.println("Enter the student name : "+(i+1));
            names[i] = sc.nextLine();
            System.out.println("Enter the mark of student : "+(i+1));
            marks[i] = sc.nextInt();
            sc.nextLine(); //This consumes newline
        }

        for(int i=0;i<size;i++){
            System.out.println(names[i]+" : "+(marks[i]));
        }

    }
}