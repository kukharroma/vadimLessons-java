package S22_11_15.abstractSimple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by roma on 01.11.15.
 */
public abstract class BaseEmployee {
    public String name;
    public double salary;
    public int numbersOfSubordinates;
    public List<BaseEmployee> subordinates;

    public abstract double getSalary();

    public BaseEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public BaseEmployee(String name, int numbersOfSubordinates, double salary) {
        this.name = name;
        this.numbersOfSubordinates = numbersOfSubordinates;
        this.salary = salary;
        subordinates = new ArrayList<>(numbersOfSubordinates);
    }

    public void putSubordinate(int position, BaseEmployee subordinate) {
        this.subordinates.add(position, subordinate);
    }

    public void putSubordinate(BaseEmployee subordinate) {
        this.subordinates.add(subordinate);
    }


}
