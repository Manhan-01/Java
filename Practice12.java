class Calculator{
    int x = 5;
}

public class Practice12 {

    public static void main(String args[]){
        // System.out.println("Hey Mandy!!!, You are doing good, Keep going. This year you will achieve whatever you are dreamed of. Keep Dreaming, Keep Working hard  and bring the dream to reality. This year you will get a good job in FAANG and you will get it in european county. And you will able to travel all over the world and make your parents proud and show them the world as well.");
    
        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator();
        Calculator calc3 = new Calculator();

        calc1.x = 10;
        calc3.x = 1;
        System.out.println(calc1.x);
        System.out.println(calc2.x);
        System.out.println(calc3.x);
        // calc3.x = 1;

    }
}