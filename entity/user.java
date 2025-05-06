package entity;

// entity/User.java
public abstract class user {
    public String id;
    protected String name;
    protected String email;
    protected String role;
    public user(String id, String name, String email, String role) {
        this.id = id; this.name = name; this.email = email; this.role = role;
    }
    public String getRole() { return role; }
    public abstract void displayMenu();
}

