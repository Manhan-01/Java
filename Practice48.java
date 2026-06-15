enum Status{
            Running, Pending, Failed, Processed, Success;
}



public class Practice48 {

    public static void main(String args[]){

        // Status s = Status.Running;
        // System.out.println(s);

        // Status a = Status.Pending;
        // System.out.println(a);


        // Status[] a = Status.values();
        // for(Status i:a){
        //     System.out.println(i);
        // }


        Status s = Status.Pending;
        if(s== Status.Running){
            System.out.println("All good");
        }else if(s == Status.Pending){
            System.out.println("Please Wait");
        }else if(s == Status.Failed){
            System.out.println("Try again");
        }else if(s==Status.Processed){
            System.out.println("Almost There");
        }else if(s==Status.Success){
            System.out.println("Done");
        }

        
    }
}