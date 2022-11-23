package com.fasteducation.feedbackmicroservice.domain.persistence;

import com.fasteducation.feedbackmicroservice.domain.model.entity.CourseEntity;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository <CourseEntity, String> {
}
