package entity;

// entity/RegularUser.java
public class RegularUser extends user {
    public RegularUser(String id, String name, String email) {
        super(id, name, email, "RegularUser");
    }
    public void displayMenu() {
        System.out.println("1. Browse Resources\n2. Book Resource\n3. Cancel Booking\n4. Logout");
    }
}

