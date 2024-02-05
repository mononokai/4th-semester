public class App {
    public static void main(String[] args) throws Exception {
        Point point1 = new Point(1, 4); // Rectangle
        Point point2 = new Point(5, 4); // Rectangle
        Point point3 = new Point(5, 1); // Rectangle
        Point point4 = new Point(1, 1); // Rectangle
        Point point5 = new Point(4, 4); // Square
        Point point6 = new Point(4, 1); // Square
        Point point7 = new Point(1, 4); // Point test
        Point point8 = new Point(5, 4); // Line test

        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point2, point3); // length test
        Line line3 = new Line(point7, point8); // isEqualTo test

        Parallelogram para1 = new Parallelogram(point1, point5, point3, point4); // valid
        Parallelogram para2 = new Parallelogram(point1, point2, point7, point6); // has a matching point

        Rectangle rect1 = new Rectangle(point1, point2, point3, point4); // valid
        Rectangle rect2 = new Rectangle(point1, point5, point3, point4); // parallelogram, not rectangle

        Square square1 = new Square(point1, point5, point6, point4); // valid
        Square square2 = new Square(point1, point2, point3, point4); // rectangle, not square

        // point tests
        System.out.println(point1.isEqualTo(point7)); // true
        System.out.println(point1.isEqualTo(point8)); // false

        // line tests
        // Line line4 = new Line(point1, point7); // same point
        System.out.println(line1.length() + ", " + line2.length() + ", " + line3.length());
        System.out.println(line1.isEqualTo(line2)); // false
        System.out.println(line1.isEqualTo(line3)); // true

        // parallelogram tests
        System.out.println(para1.largestDiagonal().length());
        System.out.println(para1.perimeter());
        // System.out.println(para2.largestDiagonal().length()); // invalid

        // rectangle tests
        System.out.println(rect1.isValidRectangle()); // true
        System.out.println(rect2.isValidRectangle()); // false
        System.out.println(rect1.area());

        // square tests
        System.out.println(square1.isValidSquare()); // true
        System.out.println(square2.isValidSquare()); // false
        System.out.println(square1.angleBetweenDiagonals());
    }
}
