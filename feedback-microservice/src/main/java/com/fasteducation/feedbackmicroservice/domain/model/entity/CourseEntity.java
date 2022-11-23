package com.fasteducation.feedbackmicroservice.domain.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "course")
@Getter
@Setter
@NoArgsConstructor

public class CourseEntity {
    @Id
    private int C_course_id;
    private String D_name;
    private int N_hours;
    private int Teachers_Users_C_user_id;
    private int Routes_C_route_id;
}
