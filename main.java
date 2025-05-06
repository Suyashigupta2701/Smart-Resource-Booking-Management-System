import controller.UserController;
import entity.Admin;
import entity.RegularUser;
import entity.ResourceManager;
import entity.user;
import service.UserService;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserService userService = new UserService();

        // Register default users
        userService.register(new Admin("admin1", "Alice", "admin@example.com"));
        userService.register(new ResourceManager("rm1", "Bob", "rm@example.com"));
        userService.register(new RegularUser("user1", "Charlie", "user@example.com"));

        // Pass the same userService to the controller
        UserController userCtrl = new UserController(userService);

        System.out.println("Welcome to SRBMS");
        System.out.print("Enter your User ID: ");
        String id = sc.nextLine();

        user user = userCtrl.login(id);
        if (user != null) {
            System.out.println("Welcome " + user.getRole());
            user.displayMenu();
        } else {
            System.out.println("User not found.");
        }

        sc.close();
    }
}
