package Durgesh.Comparable_Comparator;

import java.util.*;

public class p1
{
    public static void main(String[] args)
    {
        int[] arr = {11, 5, 6, 120, 8, 9};
        for(int i : arr)
            System.out.print(i + " ");

        System.out.println();

        // .boxed() --> API --> It is used to convert int primitive => Integer Objects
        List<Integer> list = new ArrayList<>(Arrays.stream(arr).boxed().toList());
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        List<Student> students = new ArrayList<>();

        students.add(new Student(12, "Durgesh", "25"));
        students.add(new Student(11, "Ankit", "25"));
        students.add(new Student(56, "Samar", "25"));
        students.add(new Student(9, "Kuldeep", "25"));

        System.out.println(students);

       // Collections.sort(students);

        Collections.sort(students, new IdComparator());
        System.out.println(students);

        Collections.sort(students, new NameComparator());
        System.out.println(students);

        Set<Student> set = new TreeSet<>(new IdComparator());
     // Set<Student> set = new TreeSet<>(new NameComparator());
        set.add(new Student(12, "Durgesh", "25"));
        set.add(new Student(11, "Ankit", "25"));
        set.add(new Student(56, "Samar", "25"));
        set.add(new Student(9, "Kuldeep", "25"));
        System.out.println(set);
    }
}

/*
        class Student implements Comparable<Student>
        {
            int id;
            String name;
            String age;

            public Student(int id, String name, String age)
            {
                this.id = id;
                this.name = name;
                this.age = age;
            }

            @Override
            public String toString() {
                return "Student{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", age='" + age + '\'' +
                        '}';
            }

            @Override
            public int compareTo(Student o2) {
              //  return this.id-o2.id;
                  return this.name.compareTo(o2.name);
            }
        }
*/

class Student
{
    int id;
    String name;
    String age;

    public Student(int id, String name, String age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
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
