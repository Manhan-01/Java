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


        // ENUM -if else
        // Status s = Status.Pending;
        // if(s== Status.Running){
        //     System.out.println("All good");
        // }else if(s == Status.Pending){
        //     System.out.println("Please Wait");
        // }else if(s == Status.Failed){
        //     System.out.println("Try again");
        // }else if(s==Status.Processed){
        //     System.out.println("Almost There");
        // }else if(s==Status.Success){
        //     System.out.println("Done");
        // }


        // Enum switch

        Status s = Status.Running;

        switch(s){
            case Running:
                System.out.println("Everything looking good");
                break;
            case Pending:
                System.out.println("Please wait!, somthing weird going on");
                break;
            case Failed:
                System.out.println("Looking Terrible");
                break;
            case Processed:
                System.out.println("Here you goo");
                break;
            case Success:
                System.out.println("Done");
                break;
        }

        
    }
}