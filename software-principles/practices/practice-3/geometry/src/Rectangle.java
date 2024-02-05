class Rectangle extends Parallelogram {
    public Rectangle (Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    public boolean isValidRectangle() {
        Line line1 = new Line(points.get(0), points.get(2));
        Line line2 = new Line(points.get(1), points.get(3));

        return (line1.length() == line2.length());
    }

    public double area() {
        return sides.get(0).length() * sides.get(1).length();
    }
}