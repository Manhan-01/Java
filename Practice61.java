/**
 * Practice61 - Interface 
 */


class Hawk implements Predator{
    @Override
    public void hunt(){
        System.out.println("*Predator is hunting*");
    }

}

class Rabbit implements Prey{
    @Override
    public void flee(){
        System.out.println("Prey is fleeing");
    }
}


class Fish implements Prey, Predator{
    @Override
    public void flee(){
        System.out.println("*This fish is fleeing from larger fish*");
    }

    @Override
    public void hunt(){
        System.out.println("This fish is hunting the smaller fish");
    }


}
public class Practice61 {
    public static void main(String args[]){

        Hawk h = new Hawk();
        h.hunt();

        Rabbit r = new Rabbit();
        r.flee();

        Fish sf = new Fish();
        sf.flee();
        sf.hunt();
        

    }

    
}