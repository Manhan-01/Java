public class StudentsDetails {

    String name;
    int rollNo;
    private long phone;
    private String email;

    public void setEmail(String email){
        // int n = this.phone.length;

        if(email.contains("@gmail.com")){
            this.email = email;
        }
    }
    public void setPhone(long phone){
        String str = String.valueOf(this.phone);
        int n = str.length();
        if(n==11){
            this.phone = phone;
        }
    }

    public long getPhone(){
        return phone;

    }
    public String getEmail(){
        return email;
    }
}