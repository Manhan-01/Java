@FunctionalInterface
interface Animal{
    void bark();
}

@FunctionalInterface
interface A{
    int add(int i, int j);
}

public class Practice55 {

    public static void main(String args[]){
        Animal dog = () -> System.out.println("Dog barks");
        dog.bark();

        A obj = ( i,  j) -> i+j;
            
        
        int result = obj.add(5,4);
        System.out.println(result);

    }
}