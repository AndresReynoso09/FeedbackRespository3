package com.fasteducation.feedbackmicroservice.mapping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("AgroassistMappingConfiguration")
public class MappingConfiguration {
    @Bean
    public StudentMapper farmerMapper(){
        return new StudentMapper();
    }

}