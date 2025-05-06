package model;

// model/DateTimeRange.java
import java.time.LocalDateTime;
import java.time.Duration;
import java.util.*;
public class DateTimeRange {
    private LocalDateTime start, end;

    public DateTimeRange(LocalDateTime start, LocalDateTime end) {
        this.start = start; this.end = end;
    }

    public boolean overlaps(DateTimeRange other) {
        return start.isBefore(other.end) && end.isAfter(other.start);
    }

    public long getHours() {
        return Duration.between(start, end).toHours();
    }
}

