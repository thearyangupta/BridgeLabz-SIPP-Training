import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Year should be >= 1582");
            return;
        }

        System.out.println(year + " is leap year? " + isLeapYear(year));
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
