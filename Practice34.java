

public class Practice34 {

    public static void main(String args[]){
        
        StudentsDetails s1 = new StudentsDetails();
        s1.name = "Mandy";
        s1.rollNo = 34;
        s1.setPhone(8105405949L);
        s1.setEmail("connectwithmahan@gmail.com");
        // System.out.println(s1.getEmail());
        System.out.println("Name : "+s1.name+" Roll No.: "+s1.rollNo+" Email : "+s1.getEmail()+" Phone : "+s1.getPhone());
        // System.out.println(s1.getPhone());
    }
}