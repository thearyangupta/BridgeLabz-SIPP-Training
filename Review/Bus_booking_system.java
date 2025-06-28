import java.util.Scanner;
public class Bus_booking_system {
	public static void main(String[] args) {
		
		int max_Capacity = 50;
		double fareperkm = 5.0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Passenger name:");
		String pas_Name = sc.nextLine();
		
		System.out.print("Enter Location name:");
		String loc_Name = sc.nextLine();
		
		System.out.print("Enter number of Passengers:");
		int numPassengers = sc.nextInt();
		
		System.out.print("Enter distance to destination (in km): ");
        double distance = sc.nextDouble();

        if (numPassengers > max_Capacity) {
            System.out.println("Sorry, bus capacity is only " + max_Capacity + " passengers.");
        } else {
            double totalFare = numPassengers * distance * fareperkm;
            
            System.out.println("\n--- Booking Details ---");
            System.out.println("Passenger Name: " + pas_Name);
            System.out.println("Location: " + loc_Name);
            System.out.println("Passengers: " + numPassengers);
            System.out.println("Distance: " + distance + " km");
            System.out.println("Fare per km: ₹" + fareperkm);
            System.out.println("Total Fare: ₹" + totalFare);
        }
        String change_loc = sc.nextLine();
        System.out.println("Do you want to change the location to ? ")

        sc.close();
    }
}
