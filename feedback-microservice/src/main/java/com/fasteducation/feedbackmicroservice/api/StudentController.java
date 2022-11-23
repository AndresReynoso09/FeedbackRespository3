package com.fasteducation.feedbackmicroservice.api;

import com.fasteducation.feedbackmicroservice.domain.model.entity.StudentEntity;
import com.fasteducation.feedbackmicroservice.domain.persistence.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/feedback/student")

public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<StudentEntity> getAllStudents(){
        return studentRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createStudent(@RequestBody StudentEntity studentEntity){
        studentRepository.save(studentEntity);
    }
}
