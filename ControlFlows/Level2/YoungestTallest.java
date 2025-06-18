public class YoungestTallest {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {
            ages[i] = sc.nextInt();
            heights[i] = sc.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex])
                youngestIndex = i;
            if (heights[i] > heights[tallestIndex])
                tallestIndex = i;
        }

        System.out.println("Youngest is: " + names[youngestIndex]);
        System.out.println("Tallest is: " + names[tallestIndex]);
    }
}
