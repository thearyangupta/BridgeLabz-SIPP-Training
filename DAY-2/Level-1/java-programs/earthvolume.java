public class earthvolume {
    public static void main(String[] args) {
        double radius = 6378;
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        double volumeMiles3 = volumeKm3 / 4.168; 
        System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f", volumeKm3, volumeMiles3);
    }
}