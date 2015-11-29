package W24_11_15;

/**
 * Created by roma on 24.11.15.
 */
public class Lox {
    public static void main(String[] args) {
        try {
            try {
                throw new NullPointerException("xyu");
            } catch (NullPointerException e) {
                System.out.println("ololo");
                throw e;
            }
        } catch (NullPointerException e) {
            System.out.println("ololo");
            System.out.println(e);
        }
    }
}
