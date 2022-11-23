package com.fasteducation.feedbackmicroservice.domain.service;

import com.fasteducation.feedbackmicroservice.domain.model.entity.QueryEntity;

import java.util.List;

public interface QueryService {
    List<QueryEntity> getAll();

    QueryEntity getById(int c_query_id);

    QueryEntity update(int c_query_id);

    String value(String D_description);
}