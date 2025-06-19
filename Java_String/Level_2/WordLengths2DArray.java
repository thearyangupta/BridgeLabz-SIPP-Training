import java.util.*;
public class WordLengths2DArray {
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = split(text);
        String[][] result = wordLengthTable(words);
        System.out.println("Word\tLength");
        for (String[] row : result) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }
}