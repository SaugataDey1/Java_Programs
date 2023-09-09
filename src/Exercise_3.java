public class Exercise_3 {
    public static void main(String[] args) {

    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Monkey{
    void jump()
    {
        System.out.println("Jumping");
    }
    void bite()
    {
        System.out.println("Biting");
    }
}

class Human extends Monkey implements BasicAnimal
{
    @Override
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep()
    {
        System.out.println("Sleeping");
    }
}
