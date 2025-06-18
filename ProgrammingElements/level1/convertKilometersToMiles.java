public class convertKilometersToMiles {
        public static double convertKilometersToMilesFunction(double kilometers) {
        return kilometers / 1.6;
    }

    public static void main(String[] args) {
        double kilometers = 100;
        double miles = convertKilometersToMilesFunction(kilometers);
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
    }
}
