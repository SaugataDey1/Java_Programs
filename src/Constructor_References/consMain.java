package Constructor_References;

public class consMain {
    public static void main(String[] args) {
        System.out.println("Learning Constructor References");

        // Constructor Reference
        // ClassName::new
        Provider provider = Student::new;
        Student student = provider.getStudent();
        student.display();
    }
}
