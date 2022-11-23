package com.fasteducation.feedbackmicroservice.domain.persistence;

import com.fasteducation.feedbackmicroservice.domain.model.entity.TeachersEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeachersRepository extends MongoRepository <TeachersEntity, String>  {
}
