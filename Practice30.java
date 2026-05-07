// Constructor

 class ConstructorDemo {

    private String name;
    private int age;

    // public void setName(a){
    //     this.name = a;
    // }
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    // public void setAge(b){
    //     this.age = b;
    // }


    public ConstructorDemo(){
        name = "Mandy";
        age = 36;
    }
    
}

public class Practice30 {

    public static void main(String args[]){

        ConstructorDemo c1 = new ConstructorDemo();
        // c1.getAge();
        System.out.println(c1.getAge());
        System.out.println(c1.getName());
        
        

    }
}