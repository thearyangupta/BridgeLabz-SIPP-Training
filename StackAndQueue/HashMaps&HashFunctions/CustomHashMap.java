import java.util.*;

public class CustomHashMap {
    private static class Node {
        String key;
        int value;
        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 1000;
    private List<Node>[] buckets;

    public CustomHashMap() {
        buckets = new LinkedList[SIZE];
    }

    private int hash(String key) {
        return Math.abs(key.hashCode() % SIZE);
    }

    public void put(String key, int value) {
        int index = hash(key);
        if (buckets[index] == null)
            buckets[index] = new LinkedList<>();

        for (Node node : buckets[index]) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }

        buckets[index].add(new Node(key, value));
    }

    public Integer get(String key) {
        int index = hash(key);
        if (buckets[index] == null) return null;

        for (Node node : buckets[index]) {
            if (node.key.equals(key)) return node.value;
        }
        return null;
    }

    public void remove(String key) {
        int index = hash(key);
        if (buckets[index] != null) {
            buckets[index].removeIf(node -> node.key.equals(key));
        }
    }

    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();
        map.put("apple", 10);
        map.put("banana", 20);
        System.out.println(map.get("apple"));  // Output: 10
        map.remove("apple");
        System.out.println(map.get("apple"));  // Output: null
    }
}
