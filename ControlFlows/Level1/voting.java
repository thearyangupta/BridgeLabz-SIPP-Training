public class voting {
    static void check(int age) {
        if (age >= 18) {
            System.out.println("can vote.");
        } else {
            System.out.println("cannot vote.");
        }
    }
    public static void main(String[] args) {
        check(17);
    }
}
