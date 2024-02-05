public class Point {
    protected double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public boolean isEqualTo(Point p2) {
        return this.x == p2.x && this.y == p2.y;
    }
}
