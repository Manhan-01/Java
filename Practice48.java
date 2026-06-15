enum Status{
            Running, Pending, Failed, Processed, Success;
}

public class Practice48 {

    public static void main(String args[]){

        Status s = Status.Running;
        System.out.println(s);

        Status a = Status.Pending;
        System.out.println(a);
        
    }
}