package carbooking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/car_booking_db";
        String username = "root";
        String password = "root";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection successful!");
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
