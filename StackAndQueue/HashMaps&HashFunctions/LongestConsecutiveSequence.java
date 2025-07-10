import java.util.*;

public class LongestConsecutiveSequence {
    public static int findLongest(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int maxLength = 0;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int curr = num;
                int length = 1;
                while (set.contains(curr + 1)) {
                    curr++;
                    length++;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Length: " + findLongest(arr));
    }
}
