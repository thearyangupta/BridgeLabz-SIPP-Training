public class RemoveCharacter {
    public static void main(String[] args) {
        String str = "Hello World";
        char toRemove = 'l';
        String result = "";
        for (char ch : str.toCharArray()) {
            if (ch != toRemove) {
                result += ch;
            }
        }
        System.out.println("Modified String: " + result);
    }
}
