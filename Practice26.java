class Human{
    private String name ;
    private int age ;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String a){
        name =a;
    }

    public void setAge(int b){
        age = b;
    }
}

public class Practice26 {

    public static void main(String args[]){

        Human m1 = new Human();
        // m1.name = "Mandy";
        // m1.age = 26;
        m1.setAge(36);
        m1.setName("Dumms");

        System.out.println(m1.getName() +" "+m1.getAge());
    }
}