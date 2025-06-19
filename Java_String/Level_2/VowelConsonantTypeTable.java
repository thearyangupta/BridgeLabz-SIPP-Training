import java.util.*;
public class VowelConsonantTypeTable {
    public static String getType(char c) {
        c = (char)(c >= 'A' && c <= 'Z' ? c + 32 : c);
        if (c >= 'a' && c <= 'z') return "aeiou".indexOf(c) >= 0 ? "Vowel" : "Consonant";
        return "Not a Letter";
    }
    public static String[][] classify(String str) {
        String[][] arr = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            arr[i][0] = String.valueOf(str.charAt(i));
            arr[i][1] = getType(str.charAt(i));
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[][] result = classify(str);
        System.out.println("Char\tType");
        for (String[] row : result) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}