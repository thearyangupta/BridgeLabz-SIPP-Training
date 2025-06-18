public class calculateAreaOfTriangle {
    public static double calculateAreaOfTriangleFunction(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        double base = 10.0;
        double height = 5.0;
        double area = calculateAreaOfTriangleFunction(base, height);
        System.out.println("The area of the triangle with base " + base + " and height " + height + " is: " + area);
    }
}
