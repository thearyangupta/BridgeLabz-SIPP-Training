import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    public static void generateException(String[] names, int index) {
        System.out.println(names[index]);
    }

    public static void handleException(String[] names, int index) {
        try {
            System.out.println(names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Mayank", "Sakshi", "Ravi"};
        int index = sc.nextInt();

        handleException(names, index);
    }
}
