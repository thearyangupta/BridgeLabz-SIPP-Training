
import java.util.Scanner;

public class SelectionSortExamScores {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min]) min = j;
            int temp = arr[i]; arr[i] = arr[min]; arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) scores[i] = sc.nextInt();
        selectionSort(scores);
        for (int s : scores) System.out.print(s + " ");
    }
}
