package com.projetomongo.db.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {

    @Id
    private String id;
    private String userId;
    private String street;
    private Long number;
    private String neighborhood;
    private String complement;
    private String city;
    private String zipCode;
}
