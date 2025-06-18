
public class convertDistance {
        public static void convertDistances() {
        double distInFeet = 5280.0;

        double distInYards = distInFeet / 3;
        double distInMile = distInYards / 1760;
        System.out.println("The distance in yards is " + distInYards + " while the distance in miles is " + distInMile);
    }
    public static void main(String[] args) {
        convertDistances();
    }
}
