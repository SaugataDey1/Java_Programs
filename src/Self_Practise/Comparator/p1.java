package Self_Practise.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class p1
{
    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(85,"Shaloni"));
        students.add(new Student(14, "Rahul"));
        students.add(new Student(17, "Adarsh"));
        students.add(new Student(24, "Utkarsh"));
        students.add(new Student(5, "Anu"));
        students.add(new Student(9, "Kuldeep"));
        students.add(new Student(54, "Saugat"));

        Collections.sort(students, new IdComparator());
        System.out.println(students);

        Collections.sort(students, new NameComparator());
        System.out.println(students);

    }
}

class Student
{
    int id;
    String name;
    String age;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name +
                '}';
    }
}

class IdComparator implements Comparator<Student>
{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.id-o2.id;
    }
}

class NameComparator implements Comparator<Student>
{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}