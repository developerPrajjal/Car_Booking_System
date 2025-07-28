package carbooking;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarDAO {

    public List<String> getAllCars() {
        List<String> cars = new ArrayList<>();

        String url = "jdbc:mysql://localhost:3306/car_booking_db"; 
        String username = "root"; 
        String password = "root"; 

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "SELECT name FROM cars"; 
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                cars.add(rs.getString("name")); 
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cars;
    }
}
