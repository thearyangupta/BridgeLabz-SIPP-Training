public class ReplaceMethod {
    public static String replace(String str, char oldChar, char newChar) {
        String result = "";
        for (char ch : str.toCharArray()) {
            if (ch == oldChar) {
                result += newChar;
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "banana";
        char oldChar = 'a';
        char newChar = 'o';
        System.out.println("Original: " + str);
        System.out.println("Modified: " + replace(str, oldChar, newChar));
    }
}
