package com.anirudhhanda.demo1;

import com.anirudhhanda.demo1.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	@GetMapping
	public List<Student> hello() {
		return List.of(
				new Student(1L,
						"Anirudh Handa",
						20,
						"anirudhhanda3@gmail.com",
						LocalDate.of(2004, Month.APRIL, 11))
		);
	}

}
