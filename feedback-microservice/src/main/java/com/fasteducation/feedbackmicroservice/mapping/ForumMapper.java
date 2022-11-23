package com.fasteducation.feedbackmicroservice.mapping;

import com.fasteducation.feedbackmicroservice.domain.model.entity.ForumEntity;
import com.fasteducation.feedbackmicroservice.resource.ForumResource;
import com.fasteducation.feedbackmicroservice.resource.CreateForumResource;
import com.fasteducation.feedbackmicroservice.resource.UpdateForumResource;
import com.fasteducation.feedbackmicroservice.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class ForumMapper {
    @Autowired
    private EnhancedModelMapper mapper;

    public ForumResource toResource(ForumEntity model){
        return mapper.map(model, ForumResource.class);
    }

    public ForumEntity toModel(CreateForumResource resource){
        return mapper.map(resource, ForumEntity.class);
    }

    public ForumEntity toModel(ForumResource resource){
        return mapper.map(resource, ForumEntity.class);
    }

    public ForumEntity toModel(UpdateForumResource resource){
        return mapper.map(resource, ForumEntity.class);
    }
}
