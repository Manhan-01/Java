class calc{

    int a;

    public int add(){
        System.out.println("in add");
        return 0;
    }
}


public class Practice6 {

    public static void main(String args[]){
        int num1 = 4;
        int num2 = 5;

        Calculator calc = new Calculator();
        calc.add();

        // int result = num1+num2;
        // System.out.println(result);
    }
}