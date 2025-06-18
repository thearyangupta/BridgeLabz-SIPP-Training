import java.util.Scanner;

public class TrigonometricFunctions {
    public static double[] calculateTrigonometricFunctions(double angleDegrees) {
        double angle = Math.toRadians(angleDegrees);
        return new double[]{
            Math.sin(angle), Math.cos(angle), Math.tan(angle)
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angle = sc.nextDouble();

        double[] res = calculateTrigonometricFunctions(angle);
        System.out.println("Sine: " + res[0] + ", Cosine: " + res[1] + ", Tangent: " + res[2]);
    }
}
