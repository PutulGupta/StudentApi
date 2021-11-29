package com.studentapi.student.repository;

import com.studentapi.student.model.StudentDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<StudentDetails, Long> {


}
