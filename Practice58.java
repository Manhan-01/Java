class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread Running...");
    }
}


class Practice58{
    public static void main(String args[]){
        // System.out.println("Hello World");
        MyThread t = new MyThread();
        t.start();
    }
}