package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student edmond = new Student(
                    "Edmond",
                    "edmondgaks@gmail.com",
                    LocalDate.of(2000, Month.JANUARY,5)
            );
            Student cedro = new Student(
                    "Cedric",
                    "cedric@gmail.com",
                    LocalDate.of(2003, Month.AUGUST,12)
            );
            repository.saveAll(
                    List.of(edmond, cedro)
            );
        };
    }
}
