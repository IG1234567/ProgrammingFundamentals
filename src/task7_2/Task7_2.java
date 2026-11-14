package task7_2;

public class Task7_2 {

    public static void main(String[] args) {

        // Create two points
        Point p1 = new Point(3, 4);
        Point p2 = new Point(6, 8);

        // Test parameterized constructor
        Line line1 = new Line(p1, p2);

        System.out.println("Line 1: " + line1);
        System.out.println("Line 1 length: " + line1.length());

        // Test default constructor
        Line line2 = new Line();

        System.out.println("Line 2: " + line2);
        System.out.println("Line 2 length: " + line2.length());

        // Test getters
        System.out.println("Starting point: " + line1.getP1());
        System.out.println("Ending point: " + line1.getP2());

        // Test setters
        line1.setP1(new Point(0, 0));
        line1.setP2(new Point(3, 4));

        System.out.println("Updated line: " + line1);
        System.out.println("Updated length: " + line1.length());
    }
}
