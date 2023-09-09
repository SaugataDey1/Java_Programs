public class Emp implements Comparable<Emp>{
    private String name;
    private String phone;
    private int empID;

    public Emp(String name, String phone, int empID) {
        this.name = name;
        this.phone = phone;
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getEmpID() {
        return empID;
    }

    @Override
    public int compareTo(Emp o) {
        return this.empID - o.empID;
    }
}
