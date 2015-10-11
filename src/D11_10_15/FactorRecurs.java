package D11_10_15;

/**
 * Created by roma on 11.10.15.
 */
public class FactorRecurs {
     public static long factorial(int n) {
        long result;
        if (n == 1) {
            return 1;
        }
        result = factorial(n - 1) * n;
        return result;
    }

    public static void main(String[] args) {
        Long timeStart = System.currentTimeMillis();
        System.out.println(FactorRecurs.factorial(20));
        Long timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart);
    }
}
