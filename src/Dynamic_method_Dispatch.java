public class Dynamic_method_Dispatch {
    public static void main(String[] args) {

    }
}

class One{
    public void name(){
        System.out.println();
    }
}

class Two extends One{
    @Override
    public void name() {
        System.out.println("My name is Java in class Two");
    }
}
