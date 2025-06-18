import java.util.*;

public class Quadratic {
    public static double[] findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta < 0) return new double[0];
        else if (delta == 0) return new double[] { -b / (2 * a) };
        else {
            double sqrtDelta = Math.sqrt(delta);
            return new double[] {
                (-b + sqrtDelta) / (2 * a),
                (-b - sqrtDelta) / (2 * a)
            };
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double[] roots = findRoots(a, b, c);
        if (roots.length == 0) System.out.println("No real roots.");
        else {
            System.out.println("Roots of the equation:");
            for (double root : roots)
                System.out.println(root);
        }
    }
}
