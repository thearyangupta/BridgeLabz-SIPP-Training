import java.util.*;

public class FriendAnalyzer {
    public static int findYoungest(int[] ages) {
        int min = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[min]) min = i;
        }
        return min;
    }

    public static int findTallest(double[] heights) {
        int max = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[max]) max = i;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height (in cm) of " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        int youngest = findYoungest(ages);
        int tallest = findTallest(heights);

        System.out.println("Youngest is: " + names[youngest]);
        System.out.println("Tallest is: " + names[tallest]);
    }
}
