import java.util.Scanner;

public class CompareStringsUsingCharAt {
    public static boolean compareWithCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        boolean resultCharAt = compareWithCharAt(s1, s2);
        boolean resultEquals = s1.equals(s2);

        System.out.println("Comparison using charAt(): " + resultCharAt);
        System.out.println("Comparison using equals(): " + resultEquals);
    }
}
