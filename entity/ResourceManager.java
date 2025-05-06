package entity;

// entity/ResourceManager.java
public class ResourceManager extends user {
    public ResourceManager(String id, String name, String email) {
        super(id, name, email, "ResourceManager");
    }
    public void displayMenu() {
        System.out.println("1. Add Resource\n2. Edit Resource\n3. Delete Resource\n4. Logout");
    }
}
