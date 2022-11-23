package com.fasteducation.feedbackmicroservice.mapping;

import com.fasteducation.feedbackmicroservice.domain.model.entity.CourseEntity;
import com.fasteducation.feedbackmicroservice.resource.CourseResource;
import com.fasteducation.feedbackmicroservice.resource.CreateCourseResource;
import com.fasteducation.feedbackmicroservice.resource.UpdateCourseResource;
import com.fasteducation.feedbackmicroservice.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class CourseMapper {
    @Autowired
    private EnhancedModelMapper mapper;

    public CourseResource toResource(CourseEntity model){
        return mapper.map(model, CourseResource.class);
    }

    public CourseEntity toModel(CreateCourseResource resource){
        return mapper.map(resource, CourseEntity.class);
    }

    public CourseEntity toModel(CourseResource resource){
        return mapper.map(resource, CourseEntity.class);
    }

    public CourseEntity toModel(UpdateCourseResource resource){
        return mapper.map(resource, CourseEntity.class);
    }
}
