public class LargestOfThree {
    public static void main(String[] args) {
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        int number3 = Integer.parseInt(args[2]);

        boolean isFirstLargest = number1 >= number2 && number1 >= number3;
        boolean isSecondLargest = number2 >= number1 && number2 >= number3;
        boolean isThirdLargest = number3 >= number1 && number3 >= number2;

        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);
    }
}