package oops;

import com.bridgelabz.SumOfnum;
import jdk.dynalink.beans.StaticClass;

public class Myconstructor{
    String name;
    int age;


    public Myconstructor() {
        System.out.println("calling constructor");
    }

    public Myconstructor(String name, int age) {
        System.out.println("calling constructor");
        this.name = name;
        this.age = age;
    }

    public Myconstructor(String name) {
        this.name = name;
    }

    public Myconstructor(int age) {
        this.age = age;
    }

    public void myMethod(){
        System.out.println("calliing method");
    }
}