package com.fasteducation.feedbackmicroservice.domain.persistence;

import com.fasteducation.feedbackmicroservice.domain.model.entity.StudentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository <StudentEntity, String>  {
}
