import java.util.*;
public class ShortestLongestWord {
    public static String[] split(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            while (i < str.length() && str.charAt(i) == ' ') i++;
            StringBuilder word = new StringBuilder();
            while (i < str.length() && str.charAt(i) != ' ') word.append(str.charAt(i++));
            if (word.length() > 0) list.add(word.toString());
        }
        return list.toArray(new String[0]);
    }
    public static int getLength(String word) {
        int count = 0;
        try {
            while (true) {
                word.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }
    public static String[][] wordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(getLength(words[i]));
        }
        return table;
    }
    public static String[] findMinMax(String[][] table) {
        String shortest = table[0][0], longest = table[0][0];
        int min = Integer.parseInt(table[0][1]), max = min;
        for (int i = 1; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);
            if (len < min) {
                min = len;
                shortest = table[i][0];
            }
            if (len > max) {
                max = len;
                longest = table[i][0];
            }
        }
        return new String[]{shortest, longest};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = split(text);
        String[][] lengths = wordLengthTable(words);
        String[] result = findMinMax(lengths);
        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
    }
}