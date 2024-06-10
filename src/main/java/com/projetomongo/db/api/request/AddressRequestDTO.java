package com.projetomongo.db.api.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class AddressRequestDTO {

    private String street;
    private Long number;
    private String neighborhood;
    private String complement;
    private String city;
    private String zipCode;
}
