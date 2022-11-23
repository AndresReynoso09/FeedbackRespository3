package com.fasteducation.feedbackmicroservice.domain.persistence;

import com.fasteducation.feedbackmicroservice.domain.model.entity.QueryEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QueryRepository extends MongoRepository <QueryEntity, String>  {
}
