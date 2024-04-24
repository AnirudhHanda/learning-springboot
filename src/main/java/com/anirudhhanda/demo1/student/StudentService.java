package com.anirudhhanda.demo1.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(1L,
                        "Anirudh Handa",
                        20,
                        "anirudhhanda3@gmail.com",
                        LocalDate.of(2004, Month.APRIL, 11))
        );
    }
}
