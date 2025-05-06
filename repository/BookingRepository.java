package repository;

// repository/BookingRepository.java
import java.util.*;
import entity.Booking;
import java.util.*;

public class BookingRepository {
    private List<Booking> bookings = new ArrayList<>();
    public void save(Booking booking) { bookings.add(booking); }
    public List<Booking> findAll() { return bookings; }
}

