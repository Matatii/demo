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
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student marian = new Student(
                    1L,
                    "Marian",
                    "Marian@gmail.com",
                    LocalDate.of(2000, Month.APRIL, 15)
            );
            Student alex = new Student(
              "Alex",
              "alex@gamil.com",
              LocalDate.of(2006, Month.DECEMBER, 23)
            );

            repository.saveAll(
                    List.of(marian, alex)
            );
        };
    }

}
