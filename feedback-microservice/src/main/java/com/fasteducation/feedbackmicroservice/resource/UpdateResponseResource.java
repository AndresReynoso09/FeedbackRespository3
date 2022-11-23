package com.fasteducation.feedbackmicroservice.resource;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter

public class UpdateResponseResource {
    
    @NotNull
    @Size(max = 50)
    private int D_description;
}
