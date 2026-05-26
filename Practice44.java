abstract class Car{
    abstract public void Drive();
    public void playMusic(){
        System.out.println("Playing Music");
    }
}


class WagonR extends Car{
    public void Drive(){
        System.out.println("Started Driving");
    }
}


public class Practice44 {

    public static void main(String args[]){

        // we can create object reference of abstract class
        Car c1 = new WagonR();
        c1.Drive();
        c1.playMusic();

    }
}