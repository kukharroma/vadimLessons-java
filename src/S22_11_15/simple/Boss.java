package S22_11_15.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by roma on 01.11.15.
 */
public class Boss {
    private String bossName;
    private int numbersOfManagers;
    private List<Manager> managers;
    private double salary;

    public Boss(String bossName, int numbersOfManagers, double salary) {
        this.bossName = bossName;
        this.numbersOfManagers = numbersOfManagers;
        this.salary = salary;
        managers = new ArrayList<>(numbersOfManagers);
    }

    public double getSalary() {
        double salary = 0;

        for (int i = 0; i < numbersOfManagers; i++) {
            Manager manager = managers.get(i);
            salary = salary + manager.getSalary() + manager.getWorkersSalary();
        }
        salary = salary + this.salary;

        return salary;
    }

    public void putManager(int position, Manager manager) {
        this.managers.add(position,manager);
    }
}
