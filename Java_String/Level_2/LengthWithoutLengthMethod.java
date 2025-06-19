import java.util.*;
public class LengthWithoutLengthMethod {
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int manualLength = getLength(str);
        System.out.println(manualLength);
        System.out.println(str.length());
    }
}