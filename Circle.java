import java.awt.Point;

public class Circle {

    
    double radius;
    Point center;

    double getPerimeter(){
        return 2*3.142*radius;
        // return (2*Math.PI*radius);
    }
    double getArea(){
        return (Math.PI*radius*radius);
    }
}

 class CircleTestdrive {

    public static void main(String args[]){
        Circle c1 = new Circle();
        c1.radius = 3;
        c1.center = new Point(3,2);
        System.out.println((c1.center));
        System.out.println(c1.getArea());
    }
}