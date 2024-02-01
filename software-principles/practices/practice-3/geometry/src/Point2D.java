public class Point2D {
    protected double x, y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public boolean isEqualTo(Point2D p2) {
        return this.x == p2.x && this.y == p2.y;
    }
}
