import java.util.Scanner;

public class SubstringUsingCharAt {
    public static String getSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
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
        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String userDefined = getSubstring(text, start, end);
        String builtIn = text.substring(start, end);

        System.out.println("User-defined substring: " + userDefined);
        System.out.println("Built-in substring: " + builtIn);
        System.out.println("Are both substrings equal? " + compareWithCharAt(userDefined, builtIn));
    }
}
