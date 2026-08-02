/**
 * Practice69
 * Optional class in java
 */

import java.util.*;
import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;
import java.util.Optional;
public class Practice69 {
    public static void main(String args[]){
        List<String> names = Arrays.asList("Mahantesh", "Ashok","Sharada","Roopa","Vinayak","Rutvi","Shilpa");


        // START#################################################################START
        Optional<String> name1 = names.stream()
                        .filter(str -> str.contains("k"))
                        .findFirst();


        // System.out.println(name.get());
        System.out.println(name1.orElse("Not Found"));
        // END#################################################################END



        // START#################################################################START

        String name2 = names.stream()
                        .filter(str -> str.contains("k"))
                        .findFirst()
                        .orElse("Not Found");

        System.out.println(name2.get());

        // END#################################################################END

    }

    
}