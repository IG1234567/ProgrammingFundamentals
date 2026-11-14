package task7_1;

/**
 * Represents a point in a two-dimensional coordinate system.
 * The point has x and y coordinates.
 */
public class Point {

    /** X coordinate of the point. */
    private int x;

    /** Y coordinate of the point. */
    private int y;

    /**
     * Creates a point with the specified coordinates.
     *
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns the x coordinate.
     *
     * @return x coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Returns the y coordinate.
     *
     * @return y coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * Updates the x coordinate.
     *
     * @param x new x coordinate
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Updates the y coordinate.
     *
     * @param y new y coordinate
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Calculates the distance from the origin (0, 0).
     *
     * @return distance from the origin
     */
    public double distanceFromOrigin() {
        return Math.sqrt(x * (double) x + y * (double) y);
    }

    /**
     * Moves the point by dx and dy units.
     *
     * @param dx movement along the x axis
     * @param dy movement along the y axis
     */
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    /**
     * Calculates the distance between this point and another point.
     *
     * @param p the other point
     * @return distance between the two points
     */
    public double distance(Point p) {
        return Math.hypot((double) x - p.x, (double) y - p.y);
    }

    /**
     * Updates both coordinates of the point.
     *
     * @param x new x coordinate
     * @param y new y coordinate
     */
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns the point coordinates in [x;y] format.
     *
     * @return formatted point coordinates
     */
    @Override
    public String toString() {
        return "[" + x + ";" + y + "]";
    }
}
