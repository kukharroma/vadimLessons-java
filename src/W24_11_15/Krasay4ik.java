package W24_11_15;

/**
 * Created by roma on 24.11.15.
 */
public class Krasay4ik {
    static void romaMen() throws ArithmeticException {
        int a = 5;
        int b = 0;
        int slyvka = a / b;
    }

    public static void main(String[] args) {
        try {
            romaMen();
        } catch (ArithmeticException e) {
            System.out.println("Ромка очєнь вкусно готовіт");
        }
    }
}
