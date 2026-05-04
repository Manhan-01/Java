

public class Practice35 {

    public static void main(String[] args) {

        int nums[] = {1,2,3,4,6,7,9};
        // System.out.println(nums.length);
        int n = nums.length;
        // System.out.println(nums[2]);
        if(nums[n-1]==9){
            nums[n-2]++;
            nums[n-1] = 0;
        }else{
            nums[n-1]++;
        }
        for(int i =0;i<n;i++){
            System.out.print(nums[i]);
            System.out.print(",");
        }


        
    }
}