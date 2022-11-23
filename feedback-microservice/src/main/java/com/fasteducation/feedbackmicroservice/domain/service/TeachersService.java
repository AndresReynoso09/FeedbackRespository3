package com.fasteducation.feedbackmicroservice.domain.service;

import com.fasteducation.feedbackmicroservice.domain.model.entity.TeachersEntity;

import java.util.List;

public interface TeachersService {
    List<TeachersEntity> getAll();

    TeachersEntity getById(int Users_C_user_id);

    TeachersEntity update(int Users_C_user_id);
}