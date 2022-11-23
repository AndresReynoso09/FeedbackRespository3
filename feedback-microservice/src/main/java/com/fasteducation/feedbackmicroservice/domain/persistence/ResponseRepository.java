package com.fasteducation.feedbackmicroservice.domain.persistence;

import com.fasteducation.feedbackmicroservice.domain.model.entity.ResponseEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ResponseRepository extends MongoRepository <ResponseEntity, String>  {
}
