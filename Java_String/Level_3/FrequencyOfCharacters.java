import java.util.Scanner;

public class FrequencyOfCharacters {

    public static void printFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        boolean[] printed = new boolean[256];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!printed[c]) {
                System.out.println(c + ": " + freq[c]);
                printed[c] = true;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        printFrequency(text);
    }
}
