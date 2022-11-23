package com.fasteducation.feedbackmicroservice.service;

import com.fasteducation.feedbackmicroservice.domain.model.entity.TeachersEntity;
import com.fasteducation.feedbackmicroservice.domain.persistence.TeachersRepository;
import com.fasteducation.feedbackmicroservice.domain.service.TeachersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TeachersServiceImpl implements TeachersService {
    private final static String ENTITY ="Teacher";

    @Autowired
    private TeachersRepository teacherRepository;

    @Override
    public List<TeachersEntity> getAll() {
        return teacherRepository.findAll();
    }

    @Override
    public TeachersEntity getById(int Users_C_user_id) {
        return teacherRepository.findById(String.valueOf(Users_C_user_id)).get();
    }

    @Override
    public TeachersEntity update(int Users_C_user_id) {
        return null;
    }
}
