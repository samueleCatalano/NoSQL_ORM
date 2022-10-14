package com.nosqlorm.nosqlorm.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.lang.NonNull;

@Document
@Data
public class User {

    @Id
    @Field
    private String id;
    private String firstName;
    private String lastName;
    @Indexed(unique = true)
    private String email;
}
