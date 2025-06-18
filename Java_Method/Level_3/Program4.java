public class Program4 {
    public static double kilometersToMiles(double kilometers) {
        return kilometers * 0.621371;
    }

    public static double metersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double poundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double kilogramsToPounds(double kilograms) {
        return kilograms / 0.453592;
    }

    public static void main(String[] args) {
        // Example usage of the conversion methods
        System.out.println("10 kilometers is " + kilometersToMiles(10) + " miles.");
        System.out.println("100 meters is " + metersToFeet(100) + " feet.");
        System.out.println("32 Fahrenheit is " + fahrenheitToCelsius(32) + " Celsius.");
        System.out.println("0 Celsius is " + celsiusToFahrenheit(0) + " Fahrenheit.");
        System.out.println("150 pounds is " + poundsToKilograms(150) + " kilograms.");
        System.out.println("68 kilograms is " + kilogramsToPounds(68) + " pounds.");
    }
}