package S01_11_15.simple;

/**
 * Created by roma on 01.11.15.
 */
public class Manager {
    private String name;
    private int numbersOfWorkers;
    private double salary;
    private double workersSalary = 0;
    private Worker workers[];

    Manager(String name, int numbersOfWorkers, double salary) {
        this.name = name;
        this.numbersOfWorkers = numbersOfWorkers;
        this.salary = salary;
        workers = new Worker[numbersOfWorkers];
    }

    public double getSalary() {
        return salary;
    }

    public double getWorkersSalary() {
        for (int i = 0; i < numbersOfWorkers; i++) {
            Worker worker = workers[i];
            workersSalary = workersSalary + worker.getSalary();
        }
        return workersSalary;
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public void putWorker(int position, Worker worker) {
        this.workers[position] = worker;
    }
}
