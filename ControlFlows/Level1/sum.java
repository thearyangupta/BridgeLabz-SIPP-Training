public class sum {
    static void computeSum(int number) {

        int sum = number * (number + 1) / 2;
        System.out.println(sum);

    }
    public static void main(String[] args) {
        computeSum(10);
    }
}
