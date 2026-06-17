abstract class Animal {
    public void eat(){
        System.out.println("Eating");
    }
    public abstract void makeSound();
    public void sleeping(){
        System.out.println("Sleeping");
    }
    
}


class Lion extends Animal{
    public void makeSound(){
        System.out.println("Roaring...");
    }
}

class Cat extends Animal{
    public void makeSound(){
        System.out.println("Meow...");
    }
}

abstract class Car{
    // insted of defining the method we are declaring here
    public abstract void drive();

    public void playMusic(){
        System.out.println("Playing music");
    }
}


class WagonR extends Car{
    public void drive(){
        System.out.println("WagonR driving");
    }
}

public class Practice50 {

    public static void main(String args[]){
        // System.out.println("Abstrack keyword");

        Car obj = new WagonR();
        // The reason we created reference of abstract class(Car) and cannot create object of abstract car
        // obj.drive();
        // obj.playMusic();


        Animal leo = new Lion();
        leo.makeSound();
        leo.sleeping();
    }
}