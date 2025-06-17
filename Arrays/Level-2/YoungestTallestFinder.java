import java.util.Scanner;

public class YoungestTallestFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Enter age of " + friends[i] + ": ");
                scanner.next();
            }
            ages[i] = scanner.nextInt();

            System.out.print("Enter height of " + friends[i] + ": ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Invalid input. Enter height of " + friends[i] + ": ");
                scanner.next();
            }
            heights[i] = scanner.nextDouble();
        }

        int youngestIndex = 0;
        double tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[(int)tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("Youngest friend: " + friends[youngestIndex] + " with age " + ages[youngestIndex]);
        System.out.println("Tallest friend: " + friends[(int)tallestIndex] + " with height " + heights[(int)tallestIndex]);
    }
}