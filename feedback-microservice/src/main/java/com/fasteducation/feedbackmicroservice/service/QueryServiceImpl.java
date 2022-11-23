package com.fasteducation.feedbackmicroservice.service;

import com.fasteducation.feedbackmicroservice.domain.model.entity.QueryEntity;
import com.fasteducation.feedbackmicroservice.domain.persistence.QueryRepository;
import com.fasteducation.feedbackmicroservice.domain.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class QueryServiceImpl implements QueryService {
    private final static String ENTITY ="Query";

    @Autowired
    private QueryRepository queryRepository;

    @Override
    public List<QueryEntity> getAll() {
        return null;
    }

    @Override
    public QueryEntity getById(int c_query_id) {
        return null;
    }

    @Override
    public QueryEntity update(int C_query_id) {
        return null;
    }

    @Override
    public String value(String D_description) {
        return null;
    }
}
