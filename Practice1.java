public class Practice1 {

    public static void main(String args[]){
        byte b =127;
        int a = 256;
        // b=a; //as byte size is upto only +127 it can't hold value more than that and throws incompatible types error
        a=b;
        System.out.println(a);
        System.out.println();
        
    }
}