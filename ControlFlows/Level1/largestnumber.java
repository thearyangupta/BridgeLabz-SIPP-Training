public class largestnumber {
    static void checkLargest(int num1, int num2, int num3) {
        System.out.println(" num1 " + (num1 > num2 && num1 > num3));
        System.out.println(" num2 " + (num2 > num1 && num2 > num3));
        System.out.println(" num3" + (num3 > num1 && num3 > num2));
    }
    public static void main(String[] args) {
        checkLargest(3, 7, 2);
    }
}
