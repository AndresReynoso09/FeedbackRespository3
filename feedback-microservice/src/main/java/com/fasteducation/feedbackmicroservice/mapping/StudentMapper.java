package com.fasteducation.feedbackmicroservice.mapping;

import com.fasteducation.feedbackmicroservice.domain.model.entity.StudentEntity;
import com.fasteducation.feedbackmicroservice.resource.StudentResource;
import com.fasteducation.feedbackmicroservice.resource.CreateStudentResource;
import com.fasteducation.feedbackmicroservice.resource.UpdateStudentResource;
import com.fasteducation.feedbackmicroservice.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentMapper {
    @Autowired
    private EnhancedModelMapper mapper;

    public StudentResource toResource(StudentEntity model){
        return mapper.map(model, StudentResource.class);
    }

    public StudentEntity toModel(CreateStudentResource resource){
        return mapper.map(resource, StudentEntity.class);
    }

    public StudentEntity toModel(StudentResource resource){
        return mapper.map(resource, StudentEntity.class);
    }

    public StudentEntity toModel(UpdateStudentResource resource){
        return mapper.map(resource, StudentEntity.class);
    }
}
