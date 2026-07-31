/**
 * Practice64
 */

import java.util.*;
public class Practice64 {

    public static void main(String args[]){

        List<Integer> nums = Arrays.asList(4,5,6,8,9,2);

        // Normal for loop
        // for(int i=0;i<nums.size();i++){
        //     System.out.println(nums.get(i));
        // }

        // Enhanced for loop
        // for(int n: nums){
        //     System.out.println(n);
        // }

        // forEach loop
        nums.forEach(n -> System.out.println(n));

        // int sum = 0;
        // for(int n : nums){
        //     if(n%2==0){
        //         n=n*2;
        //         sum=sum+n;
        //     }
        // }

        // System.out.println(sum);


    }
}