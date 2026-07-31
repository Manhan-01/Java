/**
 * Practice65
 */

import java.util.*;
import java.util.function.Consumer;
public class Practice65 {

    public static void main(String args[]){

        List<Integer> nums = Arrays.asList(2,4,5,6,7,9);
        // Consumer<Integer> con = (Integer n) -> ;

        nums.forEach(n -> System.out.println(n));

    }
}