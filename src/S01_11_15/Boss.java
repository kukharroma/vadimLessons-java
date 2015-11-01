package S01_11_15;

/**
 * Created by roma on 01.11.15.
 */
public class Boss {
    private String bossName;
    private int numbersOfManagers;
    private Manager managers[];
    private double salary;

    public Boss(String bossName, int numbersOfManagers, double salary) {
        this.bossName = bossName;
        this.numbersOfManagers = numbersOfManagers;
        this.salary = salary;
        managers = new Manager[numbersOfManagers];
    }

    public double getSalary() {
        double salary = 0;

        for (int i = 0; i < numbersOfManagers; i++) {
            Manager manager = managers[i];
            salary = salary + manager.getSalary() + manager.getWorkersSalary();
        }
        salary = salary + this.salary;

        return salary;
    }

    public void putManager(int position, Manager manager) {
        this.managers[position] = manager;
    }
}
