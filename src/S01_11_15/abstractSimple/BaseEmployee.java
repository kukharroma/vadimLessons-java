package S01_11_15.abstractSimple;

/**
 * Created by roma on 01.11.15.
 */
public abstract class BaseEmployee {
    public String name;
    public double salary;
    public int numbersOfSubordinates;
    public BaseEmployee subordinates[];
    public abstract double getSalary();

    public BaseEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public BaseEmployee(String name, int numbersOfSubordinates, double salary) {
        this.name = name;
        this.numbersOfSubordinates = numbersOfSubordinates;
        this.salary = salary;
        subordinates = new BaseEmployee[numbersOfSubordinates];
    }
    public void putSubordinate(int position, BaseEmployee subordinate) {
        this.subordinates[position] = subordinate;
    }


}
