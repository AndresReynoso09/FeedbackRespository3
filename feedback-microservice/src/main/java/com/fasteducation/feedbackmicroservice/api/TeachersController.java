package com.fasteducation.feedbackmicroservice.api;

import com.fasteducation.feedbackmicroservice.domain.model.entity.TeachersEntity;
import com.fasteducation.feedbackmicroservice.domain.persistence.TeachersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/feedback/teachers")

public class TeachersController {

    @Autowired
    private TeachersRepository teachersRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<TeachersEntity> getAllTeachers(){
        return teachersRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createResponse(@RequestBody TeachersEntity teachersEntity){
        teachersRepository.save(teachersEntity);
    }
}
