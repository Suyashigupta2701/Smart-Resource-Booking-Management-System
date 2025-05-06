package entity;

// entity/Resource.java
public class Resource {
    public String id, name, type;
    private double costPerHour;
    private boolean isAvailable = true;

    public Resource(String id, String name, String type, double costPerHour) {
        this.id = id; this.name = name; this.type = type; this.costPerHour = costPerHour;
    }
    // Getters and setters...
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public double getCostPerHour() {
        return costPerHour;
    }
    
    public void setCostPerHour(double costPerHour) {
        this.costPerHour = costPerHour;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
    
}

