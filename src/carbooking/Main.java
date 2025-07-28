package carbooking;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarDAO carDAO = new CarDAO();
        BookingDAO bookingDAO = new BookingDAO();

        while (true) {
            System.out.println("=== Welcome to the Car Booking System ===");
            System.out.println("1. View Cars");
            System.out.println("2. Book a Car");
            System.out.println("3. View Bookings");
            System.out.println("4. Cancel Booking");
            System.out.println("5. Update Customer Name in Booking");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    List<String> cars = carDAO.getAllCars();
                    System.out.println("Available Cars:");
                    for (int i = 0; i < cars.size(); i++) {
                        System.out.println((i + 1) + ". " + cars.get(i));
                    }
                    break;

                case 2:
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Car ID: ");
                    int carId = scanner.nextInt();
                    scanner.nextLine();
                    bookingDAO.bookCar(carId, name);
                    break;

                case 3:
                    bookingDAO.viewBookings();
                    break;

                case 4:
                    System.out.print("Enter Booking ID to cancel: ");
                    int cancelId = scanner.nextInt();
                    bookingDAO.cancelBooking(cancelId);
                    break;

                case 5:
                    System.out.print("Enter Booking ID to update: ");
                    int bookingId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new customer name: ");
                    String newName = scanner.nextLine();
                    bookingDAO.updateBookingName(bookingId, newName);
                    break;

                case 6:
                    System.out.println("Thank you for using the Car Booking System!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Try again.");
            }

            System.out.println(); 
        }
    }
}
