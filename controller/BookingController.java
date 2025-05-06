package controller;
// controller/BookingController.java
import service.BookingService;
import entity.*;
import model.DateTimeRange;

public class BookingController {
    private BookingService service = new BookingService();

    public boolean checkAvailability(Resource r, DateTimeRange range) {
        return service.isAvailable(r, range);
    }

    public void confirmBooking(Booking b) {
        service.confirm(b);
    }
}

