public class Method_Overriding {
    public static void main(String[] args) {
         A a = new A();
         a.meth2();

         B b = new B();
         b.meth2();
    }
}

class A{
    public int a;
    public int harry()
    {
        return 4;
    }

    public void meth2()
    {
        System.out.println("I am Method 2 of class A");
    }
}

class B extends  A{
    public void meth3()
    {
        System.out.println("I am Method 3 of class B");
    }
    @Override
    public void meth2()
    {
        System.out.println("I am Method 2 of class B");
    }
}
