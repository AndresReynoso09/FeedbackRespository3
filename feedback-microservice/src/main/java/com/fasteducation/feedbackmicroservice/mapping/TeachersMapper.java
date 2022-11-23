package com.fasteducation.feedbackmicroservice.mapping;

import com.fasteducation.feedbackmicroservice.domain.model.entity.TeachersEntity;
import com.fasteducation.feedbackmicroservice.resource.TeachersResource;
import com.fasteducation.feedbackmicroservice.resource.CreateTeachersResource;
import com.fasteducation.feedbackmicroservice.resource.UpdateTeachersResource;
import com.fasteducation.feedbackmicroservice.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class TeachersMapper {
    @Autowired
    private EnhancedModelMapper mapper;

    public TeachersResource toResource(TeachersEntity model){
        return mapper.map(model, TeachersResource.class);
    }

    public TeachersEntity toModel(CreateTeachersResource resource){
        return mapper.map(resource, TeachersEntity.class);
    }

    public TeachersEntity toModel(TeachersResource resource){
        return mapper.map(resource, TeachersEntity.class);
    }

    public TeachersEntity toModel(UpdateTeachersResource resource){
        return mapper.map(resource, TeachersEntity.class);
    }
}
