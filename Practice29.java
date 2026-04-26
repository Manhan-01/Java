// Encapsulation

class Demo{
    private String name;
    private int age;

    // public void Test(){
    //     System.out.println("User name is : "+name+" and age is :"+age);

    public void setName(String settingName){
        this.name = settingName;
    }
    public String getName(){
        return name;
    }
    }



public class Practice29 {

    public static void main(String args[]){

        Demo n = new Demo();
        n.setName("Mandy"); 
        // n.age = 36;
        // n.Test();
        n.getName();
        System.out.println(n.getName());
    }
}