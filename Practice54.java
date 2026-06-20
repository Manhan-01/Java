interface A{
    void show();
    void config();
}


class B implements A{
    public void show(){
        System.out.println("In B show");
    }
    public void config(){
        System.out.println("In B config");
    }
}

public class Practice54 {

    public static void main(String args[]){
    // Interface is just like a class but by default all the methods are public and abstract.

    A obj;
    obj = new B();
    obj.show();
    obj.config();



    }
}