/**
 * Practice62
 */

import java.util.*;

public class Practice62 {

    public static void main(String args[]){

        // Collection<Integer> nums = new ArrayList<Integer>();
        // nums.add(1);
        // nums.add(5);
        // nums.add(12);

        // List<Integer> i = new ArrayList<Integer>();
        // i.add(2);
        // i.add(4);
        // i.add(7);
        // i.add(90);

        // System.out.println(i.get(3));
        // // nums.add("4");

        // // System.out.println(nums);
        // // for(int n : nums){
        // //     System.out.println(n);
        // // }


        // Collection<Integer> b = new ArrayList<Integer>();

        // for (int a =1;a<11;a++){
        //     b.add(a*5);
        // }

        // System.out.println(b);


        // Set is unique array list(doesn't allow repeated values) and Hashset is not sorted
        // Set<Integer> s = new HashSet<Integer>();
        // s.add(12);
        // s.add(23);
        // s.add(52);
        // s.add(72);
        // s.add(23);
        // s.add(7);

        // System.out.println(s);


        // To use sorted set use Tree set
        Set<Integer> s = new TreeSet<Integer>();
        s.add(12);
        s.add(23);
        s.add(52);
        s.add(72);
        s.add(23);
        s.add(7);

        System.out.println(s);




    }
}