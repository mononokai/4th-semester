import java.util.ArrayList;

public class Line {
    protected ArrayList<Point2D> points;

    public Line(Point2D p1, Point2D p2) {
        if (p1.isEqualTo(p2)) {
            throw new IllegalArgumentException("Points cannot match");
        }

        points = new ArrayList<>();
        points.add(p1);
        points.add(p2);
    }

    public boolean isEqualTo(Line l2) {
        return this.points.get(0).isEqualTo(l2.points.get(0))
            && this.points.get(1).isEqualTo(l2.points.get(1))
            || this.points.get(0).isEqualTo(l2.points.get(1))
            && this.points.get(1).isEqualTo(l2.points.get(0));
    }

    public double length() {
        Point2D p1 = points.get(0);
        Point2D p2 = points.get(1);

        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }
}
