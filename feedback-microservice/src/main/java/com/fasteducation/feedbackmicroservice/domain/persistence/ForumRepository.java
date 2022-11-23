package com.fasteducation.feedbackmicroservice.domain.persistence;

import com.fasteducation.feedbackmicroservice.domain.model.entity.ForumEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ForumRepository extends MongoRepository <ForumEntity, String> {
}
