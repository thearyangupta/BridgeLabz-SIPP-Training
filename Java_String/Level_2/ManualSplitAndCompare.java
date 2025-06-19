import java.util.*;
public class ManualSplitAndCompare {
    public static String[] manualSplit(String str) {
        List<String> words = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            while (i < str.length() && str.charAt(i) == ' ') i++;
            StringBuilder sb = new StringBuilder();
            while (i < str.length() && str.charAt(i) != ' ') sb.append(str.charAt(i++));
            if (sb.length() > 0) words.add(sb.toString());
        }
        return words.toArray(new String[0]);
    }
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (!a[i].equals(b[i])) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] manual = manualSplit(text);
        String[] builtin = text.split(" ");
        System.out.println( Arrays.toString(manual));
        System.out.println(Arrays.toString(builtin));
        System.out.println(compareArrays(manual, builtin));
    }
}