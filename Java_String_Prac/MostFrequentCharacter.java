public class MostFrequentCharacter {
    public static void main(String[] args) {
        String str = "success";
        int[] freq = new int[256];
        for (char ch : str.toCharArray()) {
            freq[ch]++;
        }

        char mostFrequent = ' ';
        int max = 0;
        for (char ch : str.toCharArray()) {
            if (freq[ch] > max) {
                max = freq[ch];
                mostFrequent = ch;
            }
        }
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }
}
