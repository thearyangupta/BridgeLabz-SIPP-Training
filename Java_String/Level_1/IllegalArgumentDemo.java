import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void generateException(String text, int start, int end) {
        System.out.println(text.substring(start, end));
    }

    public static void handleException(String text, int start, int end) {
        try {
            System.out.println(text.substring(start, end));
        } catch (IllegalArgumentException | StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        handleException(text, end, start);
    }
}
