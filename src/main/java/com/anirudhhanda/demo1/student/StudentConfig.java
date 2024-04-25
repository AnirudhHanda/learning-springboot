package com.anirudhhanda.demo1.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student anirudh = new Student(
                    "Anirudh Handa",
                    "anirudhhanda3@gmail.com",
                    LocalDate.of(2004, Month.APRIL, 11)
            );

            Student aditi = new Student(
                    "Aditi Handa",
                    "aditihanda43@gmail.com",
                    LocalDate.of(2002, Month.JULY, 8)
            );

            repository.saveAll(
                    List.of(anirudh, aditi)
            );
        };
    }
}
