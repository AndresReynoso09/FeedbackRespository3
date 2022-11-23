package com.fasteducation.feedbackmicroservice.resource;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter

public class UpdateCourseResource {
    
    @NotNull
    @Size(max = 50)
    private String D_name;
    
    @NotNull
    private int N_hours;
    
    @NotNull
    private int Teachers_Users_C_user_id;
    
    @NotNull
    private int Routes_C_route_id;
}
