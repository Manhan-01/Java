// Think of int variable is a cup which can hold 2147483647, anything after this will spill from the cup, so java will throw error.
public class Practice28 {

    public static void main(String args[]){
        // int intSize = 2147483647;
        int intSize = 2147483648;
        System.out.println(intSize);
    }
}