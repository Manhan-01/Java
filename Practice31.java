import java.lang.reflect.Parameter;

class Students{
    private String name;
    private int marks;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setMarks(int marks){
        this.marks = marks;
    }
    public int getMarks(){
        return marks;
    }


    // Created a constructor here, which applies some default values. These will be default instance variables
    // This is also called Default Constructor
    Students(){
        name = "Mandy";
        marks = 35;
    }


    // Parameterized Constructor
    Students(String n, int m){
        name = n;
        marks = m;
    }
}

public class Practice31 {

    public static void main(String args[]){
        Students s1 = new Students();
        // s1.name = "Mandy";

        // s1.setName("Mandy");

        // System.out.println(s1.getName());


        s1.setMarks(97);
        System.out.println(s1.getMarks());


        // Parameterized constructor
        Students s2 = new Students("Dumms", 95);
        System.out.println(s2.getMarks());


    }
}