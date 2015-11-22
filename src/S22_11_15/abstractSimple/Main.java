package S22_11_15.abstractSimple;

/**
 * Created by roma on 01.11.15.
 */
public class Main {
    public static void main(String[] args) {
        BaseEmployee worker1 = new Worker("Vasya", 200.80);
        BaseEmployee worker2 = new Worker("Petya", 150.20);
        BaseEmployee worker3 = new Worker("Katya", 200.25);
        BaseEmployee worker4 = new Worker("Vova", 300.10);
        BaseEmployee worker5 = new Worker("Grisha", 80.75);
        BaseEmployee manager1 = new Manager("John", 5, 1.85);
        BaseEmployee manager2 = new Manager("John", 5, 1.85);
        BaseEmployee boss = new Boss("Edik", 1, 66.05);
        manager1.putSubordinate(0, worker1);
        manager1.putSubordinate(1, worker2);
        manager1.putSubordinate(2, worker3);
        manager1.putSubordinate(3, worker4);
        manager1.putSubordinate(4, worker5);
        manager2.putSubordinate(worker1);
        manager2.putSubordinate(worker2);
        manager2.putSubordinate(worker3);
        manager2.putSubordinate(worker4);
        manager2.putSubordinate(worker5);
        manager2.subordinates.remove(0);
        boss.putSubordinate(0, manager1);
        System.out.println(boss.getSalary());
        boss.putSubordinate(0, manager2);
        System.out.println(boss.getSalary());
    }


}
