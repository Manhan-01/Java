/**
 * Practice67
 * Stream API
 */
import java.util.stream.Stream;
import java.util.*;
public class Practice67 {

    public static void main(String args[]){

        List<Integer> nums = Arrays.asList(3,5,2,7,9,45,4,7,8);

        // Using of stream API
        // Stream<Integer> s1 = nums.stream(); 
        /*
        Stream doesn't copy/clone of original collection/list. It just reads the collection/list and doesn't duplicate it.
        COllection stores the data and stream lets data flow through processing steps.

        We can use the stream only once and can't reuse
        */

        // nums.forEach(n -> System.out.println(n));
        // System.out.println(s1);

        // START###########################################################################START

        // below is the example evidance of "stream can be only used onee" => uncomment both of the below lines of code and you will be able to see the output for the first line but second line will through run time error
        // s1.forEach(a -> System.out.println(a));
        // s1.forEach(a -> System.out.println(a));

        // END###########################################################################END

        // START###########################################################################START
        // get only the even values from a collection/list using stream
        // Stream<Integer> s1 = nums.stream(); 
        // Stream<Integer> s2 = s1.filter(n -> n%2==0);
        // s2.forEach(a -> System.out.println(a));

        // In the above example we are creating a stream of s1, s2. we are using s2 to filter the things
        // END###########################################################################END

        // START###########################################################################START
        // We can also use the stream on top of another stream
        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n%2==0);
        // Stream<Integer> s3 = s2.map(m -> m*2);

        /*We got error for the below lines, because as I mentioned above a stream can only be used once, so as s1 is already used by s2, s2 is already used by s3, We cannot use it further, ever to print. hence we got error
        // s1.forEach(n -> System.out.println("s1 : "+n));
        // s2.forEach(n -> System.out.println("s2 : "+n));
        */
        
        // s3.forEach(n -> System.out.println("s3 : "+n));

        // END###########################################################################END

        // START###########################################################################START

        




    }
}