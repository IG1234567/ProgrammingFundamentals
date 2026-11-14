package task7_1;

public class Task7_1 {

    public static void main(String[] args) {

        // 1. Create a Point object
        Point p1 = new Point(5, 3);

        System.out.println("Original point: " + p1);

        // 2. Test getters
        System.out.println("X coordinate: " + p1.getX());
        System.out.println("Y coordinate: " + p1.getY());

        // 3. Test distance from origin
        System.out.println("Distance from origin: "
                + p1.distanceFromOrigin());

        // 4. Test translate
        p1.translate(2, 1);

        System.out.println("After translation: " + p1);

        // 5. Test setters
        p1.setX(10);
        p1.setY(20);

        System.out.println("After setters: " + p1);

        // 6. Test setLocation
        p1.setLocation(3, 4);

        System.out.println("After setLocation: " + p1);

        // 7. Create another Point object
        Point p2 = new Point(6, 8);

        System.out.println("Second point: " + p2);

        // 8. Test distance between two points
        System.out.println("Distance between points: "
                + p1.distance(p2));

        // 9. Test toString
        System.out.println("Point representation: "
                + p1.toString());
    }
}
