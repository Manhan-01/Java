public class Practice5 {

    public static void main(String args[]){

        // System.out.println(1000/10);
        int num = 1001999;
        int count = 0;

        while (num > 0) {
            count++;
            num = num/10;
            
        }
        System.out.println(count);
    }
}