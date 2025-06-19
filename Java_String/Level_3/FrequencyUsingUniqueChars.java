import java.util.Scanner;

public class FrequencyUsingUniqueChars {

    public static char[] getUniqueCharacters(String text) {
        char[] unique = new char[text.length()];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    found = true;
                    break;
                }
            }
            if (!found) unique[index++] = current;
        }
        char[] result = new char[index];
        System.arraycopy(unique, 0, result, 0, index);
        return result;
    }

    public static void displayFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        char[] unique = getUniqueCharacters(text);
        for (char c : unique) {
            System.out.println(c + ": " + freq[c]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        displayFrequency(text);
    }
}
