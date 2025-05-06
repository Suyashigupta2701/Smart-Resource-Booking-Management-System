package service;

// service/BookingService.java
import model.DateTimeRange;
import repository.BookingRepository;
import entity.*;
import java.util.*;

public class BookingService {
    private BookingRepository repo = new BookingRepository();

    public boolean isAvailable(Resource res, DateTimeRange range) {
        return repo.findAll().stream()
            .filter(b -> b.resource.equals(res))
            .noneMatch(b -> b.overlaps(range));
    }

    public void confirm(Booking b) { repo.save(b); }
    public List<Booking> getAll() { return repo.findAll(); }
}

