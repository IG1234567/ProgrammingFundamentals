package task3_4;

public class Task3_4 {
    public static void main(String[] args) {
        for (int number = 10; number <= 99; number++) {
            int tensDigit = number / 10;
            int onesDigit = number % 10;
            int reversedNumber = onesDigit * 10 + tensDigit;

            if (tensDigit * 2 == onesDigit && reversedNumber - number == 36) {
                System.out.println("The number is " + number + ".");
                return;
            }
        }

        System.out.println("No number satisfies the conditions.");
    }
}
