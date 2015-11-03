package T03_11_15;

/**
 * Created by roma on 03.11.15.
 */
public class Triangle {
    private double sideA, sideB, sideC;

    public Triangle(double a, double b) {
        if (a > 0) {
            this.sideA = a;
        } else new IllegalArgumentException("Side A is not valid");
        if (b > 0) {
            this.sideB = b;
        } else new IllegalArgumentException("Side B is not valid");
        this.sideC = Math.sqrt(Math.pow((this.sideA), 2) + Math.pow((this.sideB), 2));
    }
    public boolean checkingForSimilaritiesTriangles(Triangle triangle){
        return this.sideA/triangle.sideA==this.sideB/triangle.sideB && this.sideB/triangle.sideB==this.sideC/triangle.sideC;

    }
}
