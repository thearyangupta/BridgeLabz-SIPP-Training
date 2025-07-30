
import java.util.Scanner;

public class CountingSortStudentAges {
    public static void countingSort(int[] arr) {
        int max = 18, min = 10;
        int[] count = new int[max - min + 1];
        for (int age : arr) count[age - min]++;
        int index = 0;
        for (int i = 0; i < count.length; i++)
            while (count[i]-- > 0) arr[index++] = i + min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) ages[i] = sc.nextInt();
        countingSort(ages);
        for (int a : ages) System.out.print(a + " ");
    }
}
