package com.fasteducation.feedbackmicroservice.mapping;

import com.fasteducation.feedbackmicroservice.domain.model.entity.QueryEntity;
import com.fasteducation.feedbackmicroservice.resource.QueryResource;
import com.fasteducation.feedbackmicroservice.resource.CreateQueryResource;
import com.fasteducation.feedbackmicroservice.resource.UpdateQueryResource;
import com.fasteducation.feedbackmicroservice.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class QueryMapper {
    @Autowired
    private EnhancedModelMapper mapper;

    public QueryResource toResource(QueryEntity model){
        return mapper.map(model, QueryResource.class);
    }

    public QueryEntity toModel(CreateQueryResource resource){
        return mapper.map(resource, QueryEntity.class);
    }

    public QueryEntity toModel(QueryResource resource){
        return mapper.map(resource, QueryEntity.class);
    }

    public QueryEntity toModel(UpdateQueryResource resource){
        return mapper.map(resource, QueryEntity.class);
    }
}
