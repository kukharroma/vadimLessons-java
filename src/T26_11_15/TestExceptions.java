package T26_11_15;


public class TestExceptions {
    public static void main(String[] args) {
        try {
            return;
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }
}
