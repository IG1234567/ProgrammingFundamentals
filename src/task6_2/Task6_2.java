package task6_2;

public class Task6_2 {
    public static int calculateDaysBetween(
        int year_from, int month_from, int day_from,
        int year_to, int month_to, int day_to) {

        java.time.LocalDate fromDate = java.time.LocalDate.of(year_from, month_from, day_from);
        java.time.LocalDate toDate = java.time.LocalDate.of(year_to, month_to, day_to);
        
        return (int) java.time.temporal.ChronoUnit.DAYS.between(fromDate, toDate);
    }
    public static void main(String[] args) {
        System.out.println("Days between 2026-01-01 and 2026-01-31: " + calculateDaysBetween(2026, 1, 1, 2026, 1, 31));
    }
}
