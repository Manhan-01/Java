// Polymorphism
// Poly => Many 
// Morphism - Behaviour
// Same object/reference will have different Behaviour based on the instance we create
// Compile type Polymorphism => early binding => Method Overloading
// Runtime Polymorphism => late binding => Method Overriding

import java.lang.ref.Reference;

class A{

    public void show(){
        System.out.println("in A show");
    }

}
class B extends A{
    public void show(){
        System.out.println("in B show");
    }
    

}



public class Practice39 {
    public static void main(String args[]){


        // B obj = new B();
        // obj.show();


        // Reference of superclass and object of subclass
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();
    }

    
}