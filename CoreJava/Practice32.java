// Anonymous Object


class Students{

    String name;
    int rollNo;
    private String reason;

    public void scream(){
        System.out.println("Present sir!!!");
    }

    public void setReason(String reason){
        this.reason = reason;
    }
    public String getReason(){
        return name+" is absent because he is "+reason;
    }
    
}
public class Practice32 {

    public static void main(String args[]){
        // System.out.println("Hey man!!!");


        Students s1 = new Students();
        s1.name = "Mandy";
        s1.rollNo = 49;
        s1.setReason("buying a new Royal Enfield");
        System.out.println(s1.getReason());
    }
}