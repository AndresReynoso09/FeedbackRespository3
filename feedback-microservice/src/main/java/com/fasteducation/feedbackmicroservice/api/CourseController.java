package com.fasteducation.feedbackmicroservice.api;


import com.fasteducation.feedbackmicroservice.domain.model.entity.CourseEntity;
import com.fasteducation.feedbackmicroservice.domain.persistence.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/feedback/course")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<CourseEntity> getAllCourses(){
        return courseRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createCourse(@RequestBody CourseEntity courseEntity){
        courseRepository.save(courseEntity);
    }
}
