public class Practice3_Logical {

    public static void main(String args[]){
        int x = 5;
        int y = 4;
        int a =3;
        int b =4;

        // boolean result = x>y && a>b;
        boolean result = x>y || a>b;
        System.out.println(!result); //here we negated the result;
    }
}