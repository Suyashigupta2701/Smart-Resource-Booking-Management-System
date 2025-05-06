package entity;


// entity/Admin.java
public class Admin extends user {
    public Admin(String id, String name, String email) {
        super(id, name, email, "Admin");
    }
    public void displayMenu() {
        System.out.println("1. View Users\n2. View Bookings\n3. Generate Reports\n4. Logout");
    }
}
