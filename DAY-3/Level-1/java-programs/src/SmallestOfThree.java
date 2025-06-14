public class SmallestOfThree {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        
        boolean isSmallest = (number1 < number2) && (number1 < number3);
        System.out.println("Is the first number the smallest? " + isSmallest);
    }
}