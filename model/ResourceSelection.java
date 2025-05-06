package model;

// model/ResourceSelection.java
import entity.Resource;
import java.util.*;
public class ResourceSelection {
    private Resource resource;
    private DateTimeRange range;

    public ResourceSelection(Resource resource, DateTimeRange range) {
        this.resource = resource;
        this.range = range;
    }
}

