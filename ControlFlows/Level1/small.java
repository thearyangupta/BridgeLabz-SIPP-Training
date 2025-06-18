public class small {
    static void checkSmallest(int num1, int num2, int num3) {
        Boolean hai=num1 < num2 && num1 < num3;
        System.out.println(hai);
    }
    public static void main(String[] args) {
        checkSmallest(3, 5, 9);
    }
}
