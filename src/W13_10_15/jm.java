package W13_10_15;

/**
 * Created by roma on 13.10.15.
 */
public class jm {
    void petya(int[]... v) {
        for (int[] x : v) {
            for(int i=0; i<x.length;i++){
                System.out.print(x[i] + " ");
            }
            System.out.println();
        }
    }
}
