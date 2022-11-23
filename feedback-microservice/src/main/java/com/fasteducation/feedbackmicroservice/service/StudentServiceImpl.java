package com.fasteducation.feedbackmicroservice.service;

import com.fasteducation.feedbackmicroservice.domain.model.entity.StudentEntity;
import com.fasteducation.feedbackmicroservice.domain.persistence.StudentRepository;
import com.fasteducation.feedbackmicroservice.domain.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentServiceImpl implements StudentService {
    private final static String ENTITY ="Student";

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<StudentEntity> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public StudentEntity getById(int Users_C_user_id) {
        return studentRepository.findById(String.valueOf(Users_C_user_id)).get();
    }

    @Override
    public StudentEntity update(int Users_C_user_id) {
        return null;
    }

    @Override
    public String value(String D_password) {
        return null;
    }
}
