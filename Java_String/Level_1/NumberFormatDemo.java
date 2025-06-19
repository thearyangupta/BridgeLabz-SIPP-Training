import java.util.Scanner;

public class NumberFormatDemo {
    public static void generateException(String text) {
        int num = Integer.parseInt(text); 
        System.out.println("Parsed number: " + num);
    }

    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        handleException(input);
    }
}
