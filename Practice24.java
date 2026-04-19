// String

public class Practice24 {

    public static void main(String args[]){
        String s = "Hello World, How are you. This is Mahantesh";
        int n = s.length();
        int i = n-1;
        int count = 0;

        while(i>=0 && s.charAt(i) == ' '){
            i--;
        }
        while (i>=0 && s.charAt(i) !=' '){
            count++;
            i--;
        }
        System.out.println("Length of last word is : "+count);
    }
}