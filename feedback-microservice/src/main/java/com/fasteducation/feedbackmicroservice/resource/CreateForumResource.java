package com.fasteducation.feedbackmicroservice.resource;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter

public class CreateForumResource {

    @NotNull
    private int D_description;
    
    @NotNull
    private int F_date;
    
    @NotNull
    private int Student_Users_C_user_id;
}
