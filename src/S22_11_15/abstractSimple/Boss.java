package S22_11_15.abstractSimple;

/**
 * Created by roma on 01.11.15.
 */
public class Boss extends BaseEmployee {

    public Boss(String name, int numbersOfSubordinates, double salary) {
        super(name, numbersOfSubordinates, salary);
    }

    @Override
    public double getSalary() {
        double salary = 0;

        for (int i = 0; i < numbersOfSubordinates; i++) {
            BaseEmployee subordinate = subordinates.get(i);
            salary = salary + subordinate.getSalary();
        }
        salary = salary + this.salary;

        return salary;
    }

}
