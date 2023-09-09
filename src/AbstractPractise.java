public class AbstractPractise {
    public static void main(String[] args) {

    }
}

abstract class Parent2{
    public Parent2(){
        System.out.println("Mai Base2 ka Constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}

class child2 extends Parent2{
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }
}

abstract class child3 extends Parent2{
    public void greet2(){
        System.out.println("Good Afternoon");
    }
}
