package S01_11_15.simple;

/**
 * Created by roma on 01.11.15.
 */
public class Worker {
    private String name;
    private double salary;

    Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
