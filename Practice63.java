import java.util.*;

/**
 * Practice63
 */
public class Practice63 {

    public static void main(String args[]){
        Collection<Integer> c = new HashSet<Integer>();
        c.add(2);
        c.add(4);
        c.add(8);
        c.add(90);
        c.add(45);
        
        Iterator<Integer> values = c.iterator();
        while ( values.hasNext()) {
            System.out.println(values.next());
            
        }
    }
}