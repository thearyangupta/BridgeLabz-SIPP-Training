import java.util.LinkedList;
import java.util.Queue;

public class CircularTourQueue {

    public static int findStart(int[] petrol, int[] distance) {
        int n = petrol.length;
        int start = 0;
        int end = 0;
        int currentSurplus = 0;
        Queue<Integer> queue = new LinkedList<>();

        while (queue.size() < n) {
            currentSurplus += petrol[end] - distance[end];
            queue.add(end);

            while (currentSurplus < 0 && !queue.isEmpty()) {
                int removed = queue.poll();
                currentSurplus -= petrol[removed] - distance[removed];
                start = removed + 1;
            }

            end = (end + 1) % n;

            if (start >= n) return -1;
        }

        return queue.isEmpty() ? -1 : queue.peek();
    }

    public static void main(String[] args) {
        int[] petrol =   {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int result = findStart(petrol, distance);
        if (result == -1)
            System.out.println("No solution exists");
        else
            System.out.println("Start at petrol pump index: " + result);
    }
}
