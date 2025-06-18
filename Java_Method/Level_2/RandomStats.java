import java.util.*;

public class RandomStats {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = 1000 + (int)(Math.random() * 9000);
        return arr;
    }

    public static double[] findAverageMinMax(int[] arr) {
        int sum = 0, min = arr[0], max = arr[0];
        for (int num : arr) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return new double[] { sum / (double)arr.length, min, max };
    }

    public static void main(String[] args) {
        int[] numbers = generate4DigitRandomArray(5);
        System.out.println("Generated Numbers: " + Arrays.toString(numbers));
        double[] result = findAverageMinMax(numbers);
        System.out.printf("Average: %.2f\nMinimum: %.0f\nMaximum: %.0f\n", result[0], result[1], result[2]);
    }
}
