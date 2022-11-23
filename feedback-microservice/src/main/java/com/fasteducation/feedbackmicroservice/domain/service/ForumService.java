package com.fasteducation.feedbackmicroservice.domain.service;

import com.fasteducation.feedbackmicroservice.domain.model.entity.ForumEntity;

import java.util.List;

public interface ForumService {
    List<ForumEntity> getAll();

    ForumEntity getById(int C_forum_id);

    ForumEntity update(int C_forum_id);

    String value(String D_description);
}