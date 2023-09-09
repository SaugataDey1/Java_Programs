package Self_Practise.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class p1
{
        public static void main(String[] args)
        {
            ArrayList<Student> students = new ArrayList<>();

            students.add(new Student(14, "Rahul"));
            students.add(new Student(17, "Adarsh"));
            students.add(new Student(24, "Utkarsh"));
            students.add(new Student(5, "Anu"));
            students.add(new Student(9, "Kuldeep"));
            students.add(new Student(54, "Saugat"));

            Collections.sort(students);
            System.out.println(students);


        }

}

 class Student implements Comparable<Student>
{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o)
    {
        return this.id-o.id;
    }
}
