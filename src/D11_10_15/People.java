package D11_10_15;

/**
 * Created by roma on 11.10.15.
 */
public class People {

    int age;
    String name;

    static int account = 5555;

    public People(int age, String name) {
        this.age = age;
        this.name = name;
        People.account++;
    }


    public static void main(String[] args) {

        People people1 = new People(1, "a");
        People people2 = new People(1, "a");
        People people3 = new People(1, "a");

    }
}
