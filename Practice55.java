@FunctionalInterface
interface Animal{
    void bark();
}

public class Practice55 {

    public static void main(String args[]){
        Animal dog = () -> System.out.println("Dog barks");
        dog.bark();

    }
}