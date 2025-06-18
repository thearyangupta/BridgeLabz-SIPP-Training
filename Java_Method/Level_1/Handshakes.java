import java.util.Scanner;

public class Handshakes {
    public static int calculateHandshakes(int students) {
        return (students * (students - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Maximum number of handshakes: " + calculateHandshakes(n));
    }
}
