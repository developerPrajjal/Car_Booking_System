package carbooking;

import java.time.LocalDate;

public class Booking {
    private int bookingId;
    private int carId;
    private String customerName;
    private LocalDate bookingDate;

    
    public Booking(int bookingId, int carId, String customerName, LocalDate bookingDate) {
        this.bookingId = bookingId;
        this.carId = carId;
        this.customerName = customerName;
        this.bookingDate = bookingDate;
    }

    
    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }
}
