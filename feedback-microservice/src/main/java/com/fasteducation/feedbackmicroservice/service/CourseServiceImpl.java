package com.fasteducation.feedbackmicroservice.service;

import com.fasteducation.feedbackmicroservice.domain.model.entity.CourseEntity;
import com.fasteducation.feedbackmicroservice.domain.persistence.CourseRepository;
import com.fasteducation.feedbackmicroservice.domain.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CourseServiceImpl implements CourseService {
    private final static String ENTITY ="Course";

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<CourseEntity> getAll() {
        return courseRepository.findAll();
    }

    @Override
    public CourseEntity getById(int C_course_id) {
        return courseRepository.findById(String.valueOf(C_course_id)).get();
    }

    @Override
    public CourseEntity update(int C_course_id) {
        return null;
    }

    @Override
    public String value(String D_name) {
        return null;
    }
}
