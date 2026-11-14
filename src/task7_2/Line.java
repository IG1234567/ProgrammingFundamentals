package task7_2;

/**
 * Represents a line segment between two points.
 */
public class Line {

    // Attributes
    private Point p1;
    private Point p2;

    /**
     * Default constructor.
     * Creates a line from (0,0) to (0,0).
     */
    public Line() {
        this.p1 = new Point(0, 0);
        this.p2 = new Point(0, 0);
    }

    /**
     * Parameterized constructor.
     *
     * @param p1 starting point
     * @param p2 ending point
     */
    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    // Getters
    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    // Setters
    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    /**
     * Calculates the length of the line.
     *
     * @return distance between p1 and p2
     */
    public double length() {
        return p1.distance(p2);
    }

    /**
     * Returns the starting and ending points.
     *
     * @return formatted line representation
     */
    @Override
    public String toString() {
        return "Line from " + p1 + " to " + p2;
    }
}
