import java.util.Comparator;
import java.util.Objects;

public class Employee implements Comparable <Employee>
{
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Employee employee = (Employee) o;

        return id == employee.id && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

     */

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;

        if (!(o instanceof Employee employee))
            return false;

        return getId() == employee.getId();
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getId());
    }

    @Override
    public String toString()
    {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + '}';
    }

    @Override
    public int compareTo(Employee o)
    {
        return this.id - o.id;
    }


    public static Comparator<Employee> NameComparator = new Comparator<Employee>()
    {
        @Override
        public int compare(Employee o1, Employee o2)
        {
            return o1.getName().compareTo(o2.getName());
        }
    };



}
