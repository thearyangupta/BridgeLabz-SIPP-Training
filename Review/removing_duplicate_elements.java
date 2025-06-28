
public class removing_duplicate_elements {
    public static void main(String[] args) {
        int[] original = {1, 2, 2, 3, 4, 4, 5};
        int n = original.length;
        int[] unique = new int[n];
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            
            for (int j = 0; j < uniqueCount; j++) {
                if (original[i] == unique[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            
            if (!isDuplicate) {
                unique[uniqueCount] = original[i];
                uniqueCount++;
            }
        }

        
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(unique[i] + " ");
        }
    }
}