// class A extends Thread{
//     public void run(){
//         for(int i=0;i<10;i++){
//             System.out.println("Hi");
//             // Thread.sleep(20);
//             try{
//                 Thread.sleep(20);
//             }catch(InterruptedException e){
//                 e.getStackTrace();
//             }
            
//         }
//     }
// }
// class B extends Thread{
//     public void run(){
//         for(int i=0;i<10;i++){
//             System.out.println("Hello");
//             try{
//                 Thread.sleep(20);
//             }catch(InterruptedException e){
//                 e.getStackTrace();
//             }
//         }
//     }
// }

// class A implements Runnable{
//     public void run(){
//         for(int i=0;i<10;i++){
//             System.out.println("Hi");
//             // Thread.sleep(20);
//             try{
//                 Thread.sleep(20);
//             }catch(InterruptedException e){
//                 e.getStackTrace();
//             }
            
//         }
//     }
// }
// class B implements Runnable{
//     public void run(){
//         for(int i=0;i<10;i++){
//             System.out.println("Hello");
//             try{
//                 Thread.sleep(20);
//             }catch(InterruptedException e){
//                 e.getStackTrace();
//             }
//         }
//     }
// }


class Counter{
    int count;
    public void increment(){
        count++;
    }
}

class Practice60{
    public synchronized static void main(String args[]){
        System.out.println("Hallo!, Guten Abend!");

        Counter c = new Counter();
        


        Runnable a = () -> {
        for(int i=0;i<1000;i++){
            // System.out.println("Hi");
            // Thread.sleep(20);
            c.increment();
            
            
        }
    
        };

        Runnable b = () -> {
            {
        for(int i=0;i<1000;i++){
            // System.out.println("Hello");
            c.increment();
            
        }
    }
        };

        // b.setPriority(1);
        // System.out.println(a.getPriority()+" " + b.getPriority());

        // When we implement Runnable we neeed to create seperate threads
        // Runnable interface have the thread methods, hence we need to create seperate threads
        // Lamda expression works with functional interface
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();

        try{
            t1.join();
        }catch(InterruptedException e){
            e.getStackTrace();
        }
        try{
            t2.join();
        }catch(InterruptedException e){
            e.getStackTrace();
        }
        // t1.join();
        // t2.join();

        System.out.println(c.count);


    }
}


// Thread is smallest unit of execution. Every application require atleast one thread.
        // Each task will be carried out by seperate thread
        // Each Thread will have a run() method
        // multiple threads can share resourses
        // scheduler - allow a thread to execute
        // 2/8 core - scheduler will allow 2/8 threads to execute
        // Multiple inheritance in java is not possible