public class convertFeetToYardsAndMiles {
        public static double convertFeetToYardsAndMilesFunction(double distanceInFeet) {
        double yards = distanceInFeet / 3;
        double miles = yards / 1760;
        System.out.println("The distance in yards is " + yards + " and in miles is " + miles);
        return miles;
    }
    public static void main(String[] args) {
        double distanceInFeet = 5280;
        double miles = convertFeetToYardsAndMilesFunction(distanceInFeet);
        System.out.println("The distance in miles is: " + miles);
    }
}
