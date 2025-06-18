public class multiplication {
    static void printTable(int number) {
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
    public static void main(String[] args) {
        printTable(7);
    }
}
