import java.util.Scanner;

public class basicCalculator {
        public static void basicCalculatorFunction() {
        Scanner sc = new Scanner(System.in);
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
    }
    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        basicCalculatorFunction();
    }
}
