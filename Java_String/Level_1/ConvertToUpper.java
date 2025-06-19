import java.util.Scanner;

public class ConvertToUpper {
    public static String toUpperCaseManual(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static boolean compareWithCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String userUpper = toUpperCaseManual(text);
        String builtInUpper = text.toUpperCase();

        System.out.println("User-defined uppercase: " + userUpper);
        System.out.println("Built-in uppercase: " + builtInUpper);
        System.out.println("Are both equal? " + compareWithCharAt(userUpper, builtInUpper));
    }
}
