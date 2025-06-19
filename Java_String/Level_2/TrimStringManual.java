// File: TrimStringManual.java
import java.util.*;
public class TrimStringManual {
    public static int[] trimIndices(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') start++;
        while (end >= start && str.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }
    public static String manualSubstring(String str, int start, int end) {
        String res = "";
        for (int i = start; i <= end; i++) res += str.charAt(i);
        return res;
    }
    public static boolean manualCompare(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) if (s1.charAt(i) != s2.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] indices = trimIndices(input);
        String trimmed = manualSubstring(input, indices[0], indices[1]);
        String builtInTrim = input.trim();
        System.out.println(trimmed);
        System.out.println(builtInTrim);
        System.out.println(manualCompare(trimmed, builtInTrim));
    }
}
