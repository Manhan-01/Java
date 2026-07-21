/**
 * Practice59
 */

class A extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hi");
            try{
                Thread.sleep(2);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello");
            try{
                Thread.sleep(2);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class Practice59 {

    public static void main(String args[]){
        A a = new A();
        B b = new B();

        System.out.println(a.getPriority());
        b.setPriority(1);

        a.start();
        b.start();

    }
}