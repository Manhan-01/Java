import java.security.spec.ECFieldF2m;

public class Practice56 {

    public static void main(String args[]){
        // int i = 2;
        // int j = 16;
        // try{
        //     System.out.println(j/i);
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        // System.out.println("COmpleted");

        String str = null;


        int nums[] = new int[5];
        try{
            // System.out.println(10/0);
            System.out.println(nums[0]);
            // System.out.println(nums[5]);
            System.out.println(str.length());

        }
        catch(ArithmeticException e){
            System.out.println("something went wrong"+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("SOmething went wrong : "+e);
        }
        catch(Exception e){
            System.out.println("Something went wrong : "+e);
        }


        System.out.println("end");
        
    }
}