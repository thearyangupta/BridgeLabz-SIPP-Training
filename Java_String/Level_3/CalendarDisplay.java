import java.util.Scanner;

public class CalendarDisplay {

    static String[] months = {
        "", "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    static int[] daysInMonth = {
        0, 31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    static int firstDayOfMonth(int y, int m) {
        int d = 1;
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + 31 * m0 / 12) % 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();

        if (month == 2 && isLeapYear(year)) {
            daysInMonth[2] = 29;
        }

        System.out.println("     " + months[month] + " " + year);

        int firstDay = firstDayOfMonth(year, month);
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= daysInMonth[month]; day++) {
            System.out.printf("%3d ", day);
            if (((day + firstDay) % 7 == 0) || (day == daysInMonth[month])) {
                System.out.println();
            }
        }
    }
}
