package com.studentapi.student;
import com.studentapi.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class  StudentApplication {

    @Autowired
    public StudentRepository studentRepository;


    public static void main(String[] args) {
        SpringApplication.run(StudentApplication.class, args);
    }
}
