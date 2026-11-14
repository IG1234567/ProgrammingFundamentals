package task6_1;

public class Task6_1 {
    public static int calculateArea(int length, int width) {
        return length * width; 
    }
    public static double calculateArea(double length, double width) {
        return length * width; 
    }
    public static void main(String[] args) {
        int lengthInt = 5;
        int widthInt = 10;
        double lengthDouble = 5.5;
        double widthDouble = 10.5;

        int areaInt = calculateArea(lengthInt, widthInt);
        double areaDouble = calculateArea(lengthDouble, widthDouble);

        System.out.println("Area of rectangle (int): " + areaInt);
        System.out.println("Area of rectangle (double): " + areaDouble);
    }
}
