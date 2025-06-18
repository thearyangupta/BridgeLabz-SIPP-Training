public class calculateHandshakes {
        public static int calculateHandshakesFunction(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }
    public static void main(String[] args) {
        int numberOfStudents = 10; 
        int totalHandshakes = calculateHandshakesFunction(numberOfStudents);
        System.out.println("Total handshakes among " + numberOfStudents + " students is: " + totalHandshakes);
    }
}
