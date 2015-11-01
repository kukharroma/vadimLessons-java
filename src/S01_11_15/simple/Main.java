package S01_11_15.simple;

/**
 * Created by roma on 01.11.15.
 */
public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Vasya", 100.80);
        Worker worker2 = new Worker("Petya", 150.20);
        Worker worker3 = new Worker("Katya", 200.25);
        Worker worker4 = new Worker("Vova", 300.10);
        Worker worker5 = new Worker("Grisha", 80.75);
        Manager manager1 = new Manager("John", 5, 1.85);
        Boss boss = new Boss("Edik", 1, 66.05);
        manager1.putWorker(0, worker1);
        manager1.putWorker(1, worker2);
        manager1.putWorker(2, worker3);
        manager1.putWorker(3, worker4);
        manager1.putWorker(4, worker5);
        boss.putManager(0, manager1);
        System.out.println(boss.getSalary());
    }


}
