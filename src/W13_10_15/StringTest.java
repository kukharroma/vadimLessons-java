package W13_10_15;

/**
 * Created by roma on 13.10.15.
 */
public class StringTest {
    static String pacan = "лох";

    public static void main(String[] args) {
        System.out.println(pacan.charAt(2));
        System.out.println(pacan.length());
        System.out.println(pacan != "лох");
        System.out.println(pacan == "лох");

        jm batya=new jm();
        int mas[]={1,2,3,5,5};
        int mas1[]={4,5,6};
        int mas2[]={7,8,9};
        batya.petya(mas,mas1,mas2);
    }

}
