package T03_11_15;

/**
 * Created by roma on 03.11.15.
 */
public class Line {
    private double x1, y1, x2, y2;

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getLength() {
        return Math.sqrt(Math.pow((this.x2 - this.x1), 2) + Math.pow((this.y2 - this.y1), 2));
    }

    public boolean compareLenght(Line line) {
        return this.getLength() == line.getLength();
    }
}
