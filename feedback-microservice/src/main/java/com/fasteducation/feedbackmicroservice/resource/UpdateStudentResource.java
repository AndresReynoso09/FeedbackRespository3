package com.fasteducation.feedbackmicroservice.resource;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import javax.validation.constraints.Size;

@Getter
@Setter

public class UpdateStudentResource {
    
    @NotNull
    @Size(max = 50)
    private String D_password;
    
    @NotNull
    @Size(max = 50)
    private String B_student_type;

}
