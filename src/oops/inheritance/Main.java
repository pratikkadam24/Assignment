package oops;

public class Main {
    public static void main(String[] args) {
       Myconstructor obj = new Myconstructor(23);
       obj.myMethod();
        System.out.println("calling main method");
       Myconstructor obj1 = new Myconstructor("pk",23);
       Animal tiger = new Animal(4);
        System.out.println(tiger.noofleg);
        //Tiger  = new Tiger();
        // tiger.eat();

        tiger.noofleg=4;
        System.out.println(tiger.noofleg);




    }

}
