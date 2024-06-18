package br.com.dicasdeumdev.api2.config;

import br.com.dicasdeumdev.api2.domain.User;
import br.com.dicasdeumdev.api2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public CommandLineRunner startDB() {
        return args -> {
            User u1 = new User(null, "Valdir", "valdir@mail.com", "123");
            User u2 = new User(null, "Luiz", "luiz@mail.com", "123");

            repository.saveAll(List.of(u1, u2));
        };
    }
}
