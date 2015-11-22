package S22_11_15.abstractSimple;

/**
 * Created by roma on 01.11.15.
 */
public class Worker extends BaseEmployee {
    public Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
