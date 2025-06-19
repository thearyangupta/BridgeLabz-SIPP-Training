import java.util.*;
public class VotingEligibility {
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) ages[i] = rand.nextInt(90) + 10;
        return ages;
    }
    public static String[][] checkEligibility(int[] ages) {
        String[][] data = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            data[i][0] = String.valueOf(ages[i]);
            data[i][1] = ages[i] >= 18 ? "true" : "false";
        }
        return data;
    }
    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] data = checkEligibility(ages);
        System.out.println("Age\tCan Vote");
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}