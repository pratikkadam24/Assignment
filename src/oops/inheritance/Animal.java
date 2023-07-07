package oops;

public class Animal {
     String colour;
    int noofleg;

    static void Walk(){
        System.out.println("animal can walk");

    }
    final void eat(){
        System.out.println("animal can eat");

    }

    public Animal(int noofleg) {
        this.noofleg = noofleg;
    }
}

