package entity;

// entity/Booking.java
import model.DateTimeRange;

public class Booking {
    public user user;
    public Resource resource;
    public DateTimeRange timeRange;
    public double cost;

    public Booking(user user, Resource resource, DateTimeRange timeRange, double cost) {
        this.user = user; this.resource = resource; this.timeRange = timeRange; this.cost = cost;
    }

    public boolean overlaps(DateTimeRange other) {
        return timeRange.overlaps(other);
    }
}

