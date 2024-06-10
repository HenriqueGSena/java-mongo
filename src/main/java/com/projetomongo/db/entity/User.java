package com.projetomongo.db.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collation = "user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    private String id;
    private String name;
    private String email;
    private String document;
    private LocalDateTime dataRegister;
    private LocalDateTime dataUpdate;
}
