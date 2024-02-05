import java.util.ArrayList;
import java.util.Collections;

public class Parallelogram {
    protected ArrayList<Point> points;
    protected ArrayList<Line> sides;
    
    public Parallelogram(Point p1, Point p2, Point p3, Point p4) {
        Line side1 = new Line(p1, p2);
        Line side2 = new Line(p2, p3);
        Line side3 = new Line(p3, p4);
        Line side4 = new Line(p4, p1);

        points = new ArrayList<>();
        Collections.addAll(points, p1, p2, p3, p4);
        sides = new ArrayList<>();
        Collections.addAll(sides, side1, side2, side3, side4);
    }

    public Line largestDiagonal() {
        Line line1 = new Line(points.get(0), points.get(2));
        Line line2 = new Line(points.get(1), points.get(3));

        return (line1.length() > line2.length()) ? line1 : line2;
    }

    public double perimeter() {
        return sides.get(0).length() + sides.get(1).length() + sides.get(2).length() + sides.get(3).length();
    }
}
