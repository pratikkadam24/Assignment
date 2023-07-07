package oops;
class Base1{
    Base1(){
        System.out.println("main ek constructor hooon");
    }
    public int x ;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived1 extends Base1{
    public int y;
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class constructorinheritance {
    public static void main(String[] args) {
      Base1 b = new Base1();
      //Base1 s= new Base1(gety);
    }
}
