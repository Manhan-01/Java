public class Practice22 {

    
    public static void main(String args[]){
        int nums[] = {3,2,2,1};
        int k = 0;
        int val = 2;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
        System.out.println();
        System.out.println(k);
    }
}