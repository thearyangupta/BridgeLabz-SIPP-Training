
public class performIntOperations {
        public static void performIntOperation() {
        int a = 5, b = 3, c = 10;

        int rest1 = a + b * c;
        int rest2 = a * b + c;
        int rest3 = c + a / b;
        int rest4 = a % b + c;

        System.out.println("The results of Int Operations are " + rest1 + ", " + rest2 + ", " +
        		rest3 + ", and " + rest4);
    }
    public static void main(String[] args) {
        performIntOperation();
    }
}
