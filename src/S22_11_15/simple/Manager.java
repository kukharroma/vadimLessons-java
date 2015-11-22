package S22_11_15.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by roma on 01.11.15.
 */
public class Manager {
    private String name;
    private int numbersOfWorkers;
    private double salary;
    private double workersSalary = 0;
    private List<Worker> workers;

    Manager(String name, int numbersOfWorkers, double salary) {
        this.name = name;
        this.numbersOfWorkers = numbersOfWorkers;
        this.salary = salary;
        this.workers=new ArrayList<>(numbersOfWorkers);
    }

    public double getSalary() {
        return salary;
    }

    public double getWorkersSalary() {
        for (int i = 0; i < numbersOfWorkers; i++) {
            Worker worker = workers.get(i);
            workersSalary = workersSalary + worker.getSalary();
        }
        return workersSalary;
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public void putWorker(int position, Worker worker) {
        this.workers.add(position,worker);
    }
    public void putWorker(Worker worker) {
        this.workers.add(worker);
    }
}
