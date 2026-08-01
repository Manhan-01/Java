/**
 * Practice66
 */

import java.util.*;
public class Practice66 {

    public static void main(String args[]){
        Map<String,Integer> employee = new HashMap<>();
        employee.put("Mahantesh", 20381569);
        employee.put("Raki", 20581346);

        // System.out.println(employee);
        // System.out.println(employee.get("Mahantesh"));
        employee.forEach(n -> System.out.println(n));
        


    }
}