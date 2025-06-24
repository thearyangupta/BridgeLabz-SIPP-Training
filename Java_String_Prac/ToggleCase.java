public class ToggleCase {
    public static void main(String[] args) {
        String str = "Hello World";
        String toggled = "";
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                toggled += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                toggled += Character.toUpperCase(ch);
            } else {
                toggled += ch;
            }
        }
        System.out.println("Toggled Case: " + toggled);
    }
}
