package com.fasteducation.feedbackmicroservice.domain.service;

import com.fasteducation.feedbackmicroservice.domain.model.entity.ResponseEntity;

import java.util.List;

public interface ResponseService {
    List<ResponseEntity> getAll();

    ResponseEntity getById(int C_response_id);

    ResponseEntity update(int C_response_id);
}