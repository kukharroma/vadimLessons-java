/**
 * Created by roma on 08.10.15.
 */
public class MasService {

    static int mas[][] = new int[][]{
            {1,2,3},
            {2,2,2},
            {2,2,2},
            {2,2,2},
            {3,3,3}
    };

    int getMassum(int mas[][]) {
        int massum = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                massum = massum + mas[i][j];
            }
        }
        return massum;
    }

    public static void main(String[] args) {
        MasService mas1 = new MasService();
        mas1.getMassum(mas);
        System.out.println(mas1.getMassum(mas));
    }

}
