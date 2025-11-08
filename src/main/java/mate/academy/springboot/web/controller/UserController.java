package mate.academy.springboot.web.controller;

import mate.academy.springboot.web.model.User;
import java.util.List;

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
}
