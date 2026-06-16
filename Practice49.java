class A{
    public void showTheDataBelongssToThisClass(){
        System.out.println("in A show");
    }

}
class B extends A{
    @Override
    public void showTheDataBelongssToThisClass(){
        System.out.println("in B show");
    }
}

public class Practice49 {

    public static void main(String args[]){
        // Annotation
        System.out.println("Annotation is metadata");
        B s = new B();
        s.showTheDataBelongssToThisClass();
    }
}