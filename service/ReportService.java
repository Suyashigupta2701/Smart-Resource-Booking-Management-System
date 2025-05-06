package service;
import java.util.*;
// service/ReportService.java
import repository.BookingRepository;

public class ReportService {
    private BookingRepository repo;

    public ReportService(BookingRepository repo) {
        this.repo = repo;
    }

    public void printSummary() {
        System.out.println("Total bookings: " + repo.findAll().size());
    }
}

