import java.util.Scanner;

public class CharArrayConversion {
    public static char[] toCharArrayManual(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        char[] manual = toCharArrayManual(text);
        char[] builtin = text.toCharArray();

        System.out.println("Are both character arrays equal? " + compareCharArrays(manual, builtin));
    }
}
