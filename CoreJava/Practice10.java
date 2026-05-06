class Calculator{
    public int add(int x, int y){
        return x+y;
    }
    public int add(int a, int b){
        return a+b;
    }
}

public class Practice10 {

    public static void main(String args[]){
        Calculator c = new Calculator();
        // System.out.println(c.add(1,3));
        System.out.println(c.add(1,2));
    }
}


// method overwriting :
// whenever we have 2 methods with same name but with different parameter, then we wont get error instead system will use the method with suitable parameter