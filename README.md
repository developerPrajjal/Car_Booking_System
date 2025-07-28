# 🚗 Car Booking System

This is a simple Java-based Car Booking System built using **JDBC (Java Database Connectivity)** and **MySQL**. It allows users to manage car information and handle customer bookings. The project follows a modular structure using object-oriented programming principles.

---

## 📌 Features

- Add and manage car details
- Book a car for a customer
- Display available cars
- Store booking data securely in MySQL
- Proper separation using DAO, model, and database connection classes

---

## 🛠️ Technologies Used

- Java (JDK 17)
- JDBC
- MySQL (with MySQL Connector/J)
- Eclipse IDE
- Git for version control

---

## 📁 Project Structure

Car_Booking_System/
│

├── src/carbooking/

│ ├── Car.java # Car model

│ ├── Booking.java # Booking model

│ ├── CarDAO.java # Car data operations

│ ├── BookingDAO.java # Booking data operations

│ ├── DBConnection.java # MySQL connection setup

│ └── Main.java # Main class with logic flow
│
├── bin/ # Compiled .class files

├── .classpath / .project # Eclipse project files


---

## 🧪 How to Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/developerPrajjal/Car_Booking_System.git
2. Open in Eclipse:

   Go to File > Import > Existing Projects into Workspace

   Select the project folder.

3. Set up MySQL Database:
   
   Import or create the required tables (cars, bookings, etc.) manually or via SQL script.

   Update the MySQL DB credentials inside DBConnection.java.

4. Run the App:

   Right-click on Main.java > Run As > Java Application

📝 Author
Prajjal Biswas
MCA Student | RCC Institute of Information Technology
