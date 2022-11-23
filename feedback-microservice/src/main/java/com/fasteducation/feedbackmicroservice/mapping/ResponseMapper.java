package com.fasteducation.feedbackmicroservice.mapping;

import com.fasteducation.feedbackmicroservice.domain.model.entity.ResponseEntity;
import com.fasteducation.feedbackmicroservice.resource.ResponseResource;
import com.fasteducation.feedbackmicroservice.resource.CreateResponseResource;
import com.fasteducation.feedbackmicroservice.resource.UpdateResponseResource;
import com.fasteducation.feedbackmicroservice.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class ResponseMapper{
    @Autowired
    private EnhancedModelMapper mapper;

    public ResponseResource toResource(ResponseEntity model){
        return mapper.map(model, ResponseResource.class);
    }

    public ResponseEntity toModel(CreateResponseResource resource){
        return mapper.map(resource, ResponseEntity.class);
    }

    public ResponseEntity toModel(ResponseResource resource){
        return mapper.map(resource, ResponseEntity.class);
    }

    public ResponseEntity toModel(UpdateResponseResource resource){
        return mapper.map(resource, ResponseEntity.class);
    }
}
