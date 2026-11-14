package task6_3;

public class Task6_3 {
    public static int calculateDigitSum(int x) {
        if (x == 0) {
            return 0;
        }
        return (x % 10) + calculateDigitSum(x / 10);
    }

    public static void main(String[] args) {
        int number = 1342;
        System.out.println("Sum of digits of " + number + ": " + calculateDigitSum(number));
    }
}
