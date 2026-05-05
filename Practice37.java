class Calc{
    public int add(int a, int b){
        return a+b;
    }
}
class AdvCalc extends Calc{
    public int add(int a, int b){
        return a+b+2;
    }
}

public class Practice37 {

    public static void main(String args[]){
        System.out.println("Method overriding");
        // System.out.println("Mehtod overiding and Method overloading are two different concepts. In method overloading you can have 2 methods with same name but you should have different parameter. but in Mehtod overriding, you can have same method name and parameter as well. The way this works is, it gives the priority to the one we are calling.");
        // System.out.println("Here in this example, AdvCalc is child/subclass of parent/superclass Calc, and we are calling from child, so what JVM will do is, first it searches for add method in AdvCalc, if it finds the method it will use that method, else it will go to parent and look for add method there and if it finds it will use that method.");

        AdvCalc a = new AdvCalc();
        int re = a.add(5, 3);
        System.out.println(re);
    }
}