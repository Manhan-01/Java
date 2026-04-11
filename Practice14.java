// Array

public class Practice14 {

    public static void main(String args[]){
        // creating an array;
        
        int marks[] = {98,69,89,83};

        // The below block of code will give you the address in heap but not the numbers because marks itself is not an array but ref variable for an array object.
        System.out.println(marks);

        // To make it work you can run a loop through an array

        for (int i =0; i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
    
}