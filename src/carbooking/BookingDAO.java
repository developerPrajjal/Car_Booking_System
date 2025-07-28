package carbooking;

import java.sql.*;

public class BookingDAO {

    private String url = "jdbc:mysql://localhost:3306/car_booking_db";
    private String username = "root";
    private String password = "root"; // Update if you set any password

    // CREATE – Book a car
    public void bookCar(int carId, String customerName) {
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "INSERT INTO bookings (car_id, customer_name, booking_date) VALUES (?, ?, CURDATE())";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, carId);
            pstmt.setString(2, customerName);

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Booking successful!");
            } else {
                System.out.println("Booking failed.");
            }

            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ – View all bookings
    public void viewBookings() {
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "SELECT b.id, c.name AS car_name, b.customer_name, b.booking_date FROM bookings b JOIN cars c ON b.car_id = c.id";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("=== Bookings ===");
            while (rs.next()) {
                int id = rs.getInt("id");
                String carName = rs.getString("car_name");
                String customerName = rs.getString("customer_name");
                Date bookingDate = rs.getDate("booking_date");

                System.out.println("Booking ID: " + id + ", Car: " + carName + ", Customer: " + customerName + ", Date: " + bookingDate);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE – Cancel a booking
    public void cancelBooking(int bookingId) {
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "DELETE FROM bookings WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, bookingId);

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Booking cancelled successfully.");
            } else {
                System.out.println("Booking ID not found.");
            }

            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE – Update customer name
    public void updateBookingName(int bookingId, String newName) {
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "UPDATE bookings SET customer_name = ? WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, newName);
            pstmt.setInt(2, bookingId);

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Booking updated successfully!");
            } else {
                System.out.println("Booking ID not found.");
            }

            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
