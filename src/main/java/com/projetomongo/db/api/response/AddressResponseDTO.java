package com.projetomongo.db.api.response;

public record AddressResponseDTO(String street,
                                 Long number,
                                 String neighborhood,
                                 String complement,
                                 String city,
                                 String zipCode) {
}
