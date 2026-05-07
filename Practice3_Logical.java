import java.time.format.TextStyle;

public class Practice3_Logical {

    public static void main(String args[]){
        // int x = 5;
        // int y = 4;
        // int a =3;
        // int b =4;

        // // boolean result = x>y && a>b;
        // boolean result = x>y || a>b;
        // System.out.println(!result); //here we negated the result;


        // Test


        int a = 20;
        int b = 10;

        System.out.println("Addition : "+(a+b));
        System.out.println("Subtraction : "+(a-b));
        System.out.println("Multiplication : "+(a*b));
        System.out.println("Division : "+(a/b));

        boolean resA = a>b;
        boolean resB = a>b && b>0;
        System.out.println("Is a greater than b?"+ resA);
        System.out.println("Is a>b and b>0"+resB);

    }
}