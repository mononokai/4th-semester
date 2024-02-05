public class Square extends Rectangle {
    public Square (Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    public boolean isValidSquare() {
        return (isValidRectangle() 
            && sides.get(0).length() == sides.get(1).length()); 
    }

    public int angleBetweenDiagonals() {
        if (isValidSquare()) {
            return 90;
        }
        else {
            throw new IllegalArgumentException("This isn't a square");
        }
    }
}
