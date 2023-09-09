import java.util.Comparator;

public class ID_Comparator implements Comparator<Emp> {

    @Override
    public int compare(Emp e1, Emp e2) {
        return e1.getEmpID() - e2.getEmpID();
    }
}
