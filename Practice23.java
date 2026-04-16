public class Practice23 {
 
    public static void main(String args[]){
        int nums[] = {22,23,33,9,11,0,1000};
        int small = nums[0];
        int large = nums[0];

        // advanced for loop
        for(int i : nums){
            if(i<small){
                small = i;
            }else if(i>large){
                large=i;
            }
            // System.out.println(i);
        }
        System.out.println("Smallest : "+small+" Largest : "+large);
    }
}
