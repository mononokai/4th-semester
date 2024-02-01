import java.util.ArrayList;
import java.util.Collections;

public class Parallelogram {
    protected ArrayList<Point2D> points;
    
    public Parallelogram(Point2D p1, Point2D p2, Point2D p3, Point2D p4) {
        if (p1.isEqualTo(p2) || p1.isEqualTo(p3) || p1.isEqualTo(p4) || p2.isEqualTo(p3) || p2.isEqualTo(p4) || p3.isEqualTo(p4)) {
            throw new IllegalArgumentException("Points cannot match");
        }

        points = new ArrayList<>();
        Collections.addAll(points, p1, p2, p3, p4);
    }

    public Line largestDiagonal() {
        Line line1 = new Line(points.get(0), points.get(2));
        Line line2 = new Line(points.get(1), points.get(3));

        return (line1.length() > line2.length()) ? line1 : line2;
    }

    public double perimeter() {
        double line1 = new Line(points.get(0), points.get(1)).length();
        double line2 = new Line(points.get(1), points.get(2)).length();
        double line3 = new Line(points.get(2), points.get(3)).length();
        double line4 = new Line(points.get(3), points.get(4)).length();

        return line1 + line2 + line3 + line4;
    }
}
