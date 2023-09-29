package com.jason.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents() {
        return List.of(
                new Student("Thompson", "Nguyen", LocalDate.now(), "contact@thompsoncoding.com", 30),
                new Student("Johnson", "Smith", LocalDate.now(), "contact@johnsoncoding.com", 30)
        );
    }
}
