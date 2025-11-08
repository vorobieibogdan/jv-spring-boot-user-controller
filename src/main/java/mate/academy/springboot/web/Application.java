package mate.academy.springboot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Анотація, що вмикає автоконфігурацію Spring Boot і сканування компонентів
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        // Запускаємо додаток Spring Boot
        SpringApplication.run(Application.class, args);
        // Початковий вивід можна видалити, оскільки додаток тепер запускається сервером
    }
}

