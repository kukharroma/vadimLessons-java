package D11_10_15;

/**
 * Created by roma on 11.10.15.
 */
public class Factorial {
    long factorial = 1;

    int mas[] = new int[7];

    long factorial_a(int a) {
        if (a < 0) return 0;
        for (int i = 1; i < a + 1; i++) {
            factorial = factorial * i;
        }
        return factorial;

    }

    public static void main(String[] args) {
        Factorial fac = new Factorial();
        System.out.println(fac.factorial_a(5));
        fac.factorial_a(20);
    }
}