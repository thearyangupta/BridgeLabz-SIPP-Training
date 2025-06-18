
public class performDoubleOperations {
        public static void performDoubleOperation() {
        double a = 5.5, b = 3.0, c = 10.0;

        double rest1 = a + b * c;
        double rest2 = a * b + c;
        double rest3 = c + a / b;
        double rest4 = a % b + c;

        System.out.println("The results of Double Operations are " + rest1 + ", " + rest2 + ", " +
                rest3 + ", and " + rest4);
    }
    public static void main(String[] args) {
        performDoubleOperation();
    }
}
