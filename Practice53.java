abstract class A{
    public abstract void show();
}

class B extends A{
    // @Override;
    public void show(){
        System.out.println("in B show");
    }
}


public class Practice53 {

    public static void main(String args[]){
        // Abstract + Inner class
        A obj = new A(){
            public void show(){
                System.out.println("in anonymous class show");
            }
        };
        obj.show();

    }
}