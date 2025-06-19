import java.util.Scanner;

public class UniqueCharacters {

    public static int getLength(String str) {
        int len = 0;
        try {
            while (true) {
                str.charAt(len);
                len++;
            }
        } catch (Exception e) {
            return len;
        }
    }

    public static char[] findUniqueChars(String text) {
        int len = getLength(text);
        char[] unique = new char[len];
        int count = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique[count++] = ch;
            }
        }

        char[] result = new char[count];
        for (int i = 0; i < count; i++) result[i] = unique[i];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        char[] unique = findUniqueChars(input);
        for (char ch : unique) {
            System.out.print(ch + " ");
        }
    }
}
