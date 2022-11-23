package com.fasteducation.feedbackmicroservice.resource;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter

public class UpdateQueryResource {
    
    @NotNull
    @Size(max = 50)
    private String D_description;
    
    @NotNull
    @Size(max = 50)
    private String D_title;
}
