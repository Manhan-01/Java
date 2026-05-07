// Inheritance


public class Practice33 {

    public static void main(String args[]){

        // NormalCalc n1 = new NormalCalc();
        // int r1 = n1.add(5,30);
        // int r2 = n1.sub(5,3);
        // // int r3 = n1.mult(3, 5);
        // // int r4 = n1.div(10, 2);
        // // System.out.println(r1 +" "+ r2+" "+r3+" "+r4);


        // Here NormalCalc.java has addition and substraction operator hence if we try to use mult and div, we will get the error
        // NormalCalc n1 = new NormalCalc();
        // System.out.println(n1.mult(2,5));


        // Here similar to above if we try to use add or substration we will get the error
        // AdvanceCalc n2 = new AdvanceCalc();
        // System.out.println(n2.add(10, 2));

        // Below we are using inheritance concept where we used extends keyword to include add, sub from Practice33.java to AdvanceCalc.java
        AdvanceCalc n3 = new AdvanceCalc();
        System.out.println(n3.add(5, 2));
        System.out.println(n3.sub(5, 2));
        System.out.println(n3.mult(5, 2));
        System.out.println(n3.div(5, 2));

    }
}