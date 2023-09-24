package CodeDecode_Java_8.IQ.a5;

// given an Employee list you have to sort the employee on the basis of salary Desc in Java 8

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class a5
{
    public static void main(String[] args)
    {
        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee(1, 500));
        empList.add(new Employee(2, 1000));
        empList.add(new Employee(3, 1500));
        empList.add(new Employee(4, 2000));
        empList.add(new Employee(5, 2500));
        empList.add(new Employee(6, 3000));
        empList.add(new Employee(7, 3500));
        empList.add(new Employee(8, 4000));

        // Sort on the basis of Descending Salary of employee
        List<Employee> sortedEmpList1 = empList.stream().sorted( (e1,e2) -> (int)(e2.getSalary()-e1.getSalary())).collect(Collectors.toList() );
        System.out.println(sortedEmpList1);

        // Sort on the basis of Ascending Salary of employee
        List<Employee> sortedEmpList2 = empList.stream().sorted( (e1,e2) -> (int)(e1.getSalary()-e2.getSalary())).collect(Collectors.toList() );
        System.out.println(sortedEmpList2);

        // fetch Top 3
        List<Employee> Top3sortedEmpList = empList.stream().sorted( (e1,e2) -> (int)(e2.getSalary()-e1.getSalary())).limit(3).collect(Collectors.toList() );
        System.out.println(Top3sortedEmpList);

        // fetch all the employees whose salary is less than 3 highest salary
        List<Employee> skipTop3sortedEmpList = empList.stream().sorted( (e1,e2) -> (int)(e2.getSalary()-e1.getSalary())).skip(3).collect(Collectors.toList() );
        System.out.println(skipTop3sortedEmpList);
    }
}
