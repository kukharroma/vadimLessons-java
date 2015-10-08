import javax.sound.midi.Soundbank;
import java.util.Objects;

/**
 * Created by roma on 08.10.15.
 */
public class BoxDemo extends Object{
    public static void main(String[] args) {
        Box mybox = new Box(10,15,5);

        double vol;
        mybox.depth = 10;
        mybox.height = 2;
        mybox.weight = 5;
        vol = mybox.depth * mybox.height * mybox.weight;
        System.out.println(vol);
    }


    public void recurcia(){


    }
}

class Box {

    public Box(double weight) {
        this.weight = weight;
    }

    public Box(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public Box(double weight, double height, double depth) {
        this.weight = weight;
        this.height = height;
        this.depth = depth;
    }

    double weight, height, depth;
}