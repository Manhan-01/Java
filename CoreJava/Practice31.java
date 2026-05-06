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
    static String college = "KLECET";


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


// Analogy for static keyword
// class Strdents{
//     String Sname;
//     int Smarks;
//     static String college = "KLECET";

//     public void setSName(String n){
//         this.Sname = n;
//     }
//     public String getSName(){
//         return Sname;
//     }
//     public void setSMarks(int m){
//         this.Smarks = m;
//     }
//     public int getSMarks(){
//         return Smarks;
//     }
// }

public class Practice31 {

    public static void main(String args[]){
        // Students s1 = new Students();
        // s1.name = "Mandy";

        // s1.setName("Mandy");

        // System.out.println(s1.getName());


        // s1.setMarks(97);
        // System.out.println(s1.getMarks());


        // Parameterized constructor
        Students s2 = new Students("Dumms", 95);
        System.out.println(s2.getMarks());

        Students s1 = new Students("Mandy",99);
        System.out.println(s1.college + s2.college);



    }
}