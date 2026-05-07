// final keyword 
// we can use this with variable, method, class 


final class Parent {

    public void show(){
        System.out.println("in Parent");
    }
}

class Child extends Parent{
    public void show(){
        System.out.println("in Child");
    }
}

public class Practice40 {

    public static void main(String args[]){

        // we cannot change the value of variable if we used final keyword 
        // it is like a constant 
        // final int a = 45;
        // a = 55;
        
        // System.out.println(a);
    }
}