public class height_converter {
    public static void main(String[] args) {
        double heightInCm = 170; 
        int feet = (int)(heightInCm / 2.54 / 12);
        int inches = (int)((heightInCm / 2.54) % 12);
        System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + feet + " and inches is " + inches);
    }
}