public class calculateVolumeOfEarthInCubicKilometers {
        public static double calculateVolumeOfEarthInCubicKilometersFunction() {
        double radius = 6378; 
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }
    public static void main(String[] args) {
        double volume = calculateVolumeOfEarthInCubicKilometersFunction();
        System.out.println("The volume of the Earth in cubic kilometers is: " + volume);
    }
}
