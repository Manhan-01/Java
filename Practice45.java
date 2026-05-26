class Car{

    String brand;
    class Engine{
        public void start(){
            System.out.println(brand+ " Engine starts");
        }
    }
}

class Practice45{
    public static void main(String args[]){

        // Car c1 = new Car();
        // c1.brand = "BMW";
        // c1.start();


        // Car.Engine c1 = new Engine();
        // // Car.c1.brand = "BMW";
        
        // c1.start();


        Car c1 = new Car();
        c1.brand = "Ferrari 296 GTB";

        Car.Engine engine = c1.new Engine();
        engine.start();

    }
}