package T03_11_15;

/**
 * Created by roma on 03.11.15.
 */
public class Circle {
    private double radius;
    private double lenght;
    private int x, y;

    public Circle(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        if (radius >= 0) {
            this.radius = radius;
        } else new IllegalArgumentException("Radius is not valid");
    }

    public double areaCircle() {
        return Math.PI * this.radius * this.radius;
    }

    public boolean compareAreas(Circle circle) {
        return this.areaCircle() == circle.areaCircle();
    }

}