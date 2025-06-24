
public class CountVovelAndConsonant {
    public static void main(String[] args) {

        String s = "abcdefghijklmnopqrstuvwxyz";
        int vovel = 0, consonant = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vovel++;
            } else {
                consonant++;
            }
        }
        System.out.println("Vovel is: " + vovel + " consonant is: " + consonant);
    }
}