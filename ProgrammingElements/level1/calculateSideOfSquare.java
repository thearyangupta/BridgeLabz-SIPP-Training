public class calculateSideOfSquare {
        public static double calculateSideOfSquareFunction(double perimeter) {
        return perimeter / 4;
    }
    public static void main(String[] args) {
        double perimeter = 20.0; 
        double side = calculateSideOfSquareFunction(perimeter);
        System.out.println("The side of the square with perimeter " + perimeter + " is: " + side);
    }
}
