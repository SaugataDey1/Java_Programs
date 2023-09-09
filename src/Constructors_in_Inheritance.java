class Base1{
    Base1() {
        System.out.println("I am a Base class Constructor");
    }

    Base1(int a)
    {
        System.out.println("I am a Overloaded constructor with value of a as : " + a);
    }

    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived1 extends Base1{
    Derived1(){
        // super(0);
        System.out.println("I am a Derived class Constructor");
    }

    Derived1(int x, int y)
    {
        super(x);
        System.out.println("I am an Overloaded constructor of Derived class of y as : " + y);
    }
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Constructors_in_Inheritance {
    public static void main(String[] args) {
        Base1 b = new Base1();
        // Derived1 d = new Derived1();

        Derived1 d = new Derived1(14, 9);
    }
}
