package mate.academy.springboot.web.controller;

import java.util.List; // ✅ java.* імпорти завжди першими
import mate.academy.springboot.web.model.User;

public class UserController {

    public List<User> getAllUsers() {
        return List.of(
                new User(1L, "bob@i.ua"),
                new User(2L, "alice@i.ua")
        );
    }

    public String createUser(User user) {
        return String.format("User created. Id: %s, email: %s", user.id(), user.email());
    }

    public static void main(String[] args) {
        UserController controller = new UserController();
        System.out.println(controller.getAllUsers());
        System.out.println(controller.createUser(new User(3L, "john@i.ua")));
    }
}

