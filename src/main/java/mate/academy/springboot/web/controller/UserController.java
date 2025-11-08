package mate.academy.springboot.web.controller;

import java.util.List;
import mate.academy.springboot.web.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 1. Анотація, що поєднує @Controller та @ResponseBody,
//  позначаючи, що відповіді мають бути прив'язані до тіла (наприклад, JSON).
@RestController
// 2. Визначаємо базовий шлях для всіх методів у цьому контролері.
@RequestMapping("/users")
public class UserController {

    // 3. GET: /users
    // Повертає hardcoded список користувачів (буде автоматично конвертовано в JSON).
    @GetMapping
    public List<User> getAllUsers() {
        return List.of(
                new User(1L, "bob@i.ua"),
                new User(2L, "alice@i.ua")
        );
    }

    // 4. POST: /users
    // @RequestBody вказує, що об'єкт User потрібно отримати з тіла запиту (наприклад, JSON).
    @PostMapping
    public String createUser(@RequestBody User user) {
        return String.format("User created. Id: %s, email: %s", user.id(), user.email());
    }

    // Метод main, який був у контролері, більше не потрібен
    // і його слід видалити, щоб уникнути плутанини та помилок.
}

