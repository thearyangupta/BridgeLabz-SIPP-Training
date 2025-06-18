public class checkspring {
    static void check(int month, int day) {
        if ((month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20)) {
            System.out.println("Spring Season");
        } else {
            System.out.println("Spring Season");
        }
    }
    public static void main(String[] args) {
        check(4, 10);
    }
}
