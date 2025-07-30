
import java.util.Scanner;

public class InsertionSortEmployeeIDs {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i], j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ids = new int[n];
        for (int i = 0; i < n; i++) ids[i] = sc.nextInt();
        insertionSort(ids);
        for (int id : ids) System.out.print(id + " ");
    }
}

