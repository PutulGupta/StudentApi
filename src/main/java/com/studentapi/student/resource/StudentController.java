package com.studentapi.student.resource;

import com.studentapi.student.model.StudentDetails;
import com.studentapi.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    
    @Autowired
    public StudentRepository studentRepository;


    @GetMapping(value = "/all")
   public List<StudentDetails> getAllStudents(){
       
        return studentRepository.findAll();
   }
   
   @PostMapping(value = "/create")
   public String createStudent(@RequestBody StudentDetails students){
        StudentDetails insertDetail = studentRepository.insert(students);
        return "student created" + insertDetail.getFirstname();
   }





}
