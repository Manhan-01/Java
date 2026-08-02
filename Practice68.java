import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/**
 * Practice68
 * Parallel stream
 * 
 */
public class Practice68 {

    public static void main(String args[]){

        // List<Integer> nums = Arrays.asList(19,12,38,24,45,660,8);
        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n%2==0); 
        // s2.forEach(n-> System.out.println(n));

        int size = 10_000;

        List<Integer> nums = new ArrayList<>(size);
        Random ran = new Random();

        for(int i=1;i<=size;i++){
            nums.add(ran.nextInt(100));
        }
        // System.out.println(ran.nextInt(100));

        // int sum1 = nums.stream()
        //             .map(n -> n*2)
        //             .reduce(0,(c,e) -> c+e);

        long startSeq = System.currentTimeMillis();
        

        int sum2 = nums.stream()
                    .map(i->i*2)
                    .mapToInt(i-> i)
                    .sum();

        long endSqq = System.currentTimeMillis();

        long startPara = System.currentTimeMillis();


        int sum3 = nums.parallelStream()
                    .map(i->i*2)
                    .mapToInt(i-> i)
                    .sum();
                    

        long endPara = System.currentTimeMillis();

        // System.out.println(sum1+" "+sum2+" "+sum3);
        System.out.println(sum2+" "+sum3);

        System.out.println("Seq : "+(endSqq-startSeq));

        // Parallel stream will take more time than stream, because it is responsible to create thread, which will take time
        // Hence sequential stream is faster than parallel
        System.out.println("Para : "+(endPara-startPara));
        // System.out.println(nums);

    }
}