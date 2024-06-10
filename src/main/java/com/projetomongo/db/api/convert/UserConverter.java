package com.projetomongo.db.api.convert;

import com.projetomongo.db.api.request.AddressRequestDTO;
import com.projetomongo.db.api.request.UserRequestDTO;
import com.projetomongo.db.entity.Address;
import com.projetomongo.db.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class UserConverter {

    public User toEntity(UserRequestDTO userRequestDTO) {
        return User.builder()
            .id(UUID.randomUUID().toString())
            .name(userRequestDTO.getName())
            .email(userRequestDTO.getEmail())
            .document(userRequestDTO.getDocument())
            .dataRegister(LocalDateTime.now())
            .build();
    }

    public Address toAddress(AddressRequestDTO addressRequestDTO, String userId) {
        return Address.builder()
            .street(addressRequestDTO.getStreet())
            .neighborhood(addressRequestDTO.getNeighborhood())
            .userId(userId)
            .zipCode(addressRequestDTO.getZipCode())
            .city(addressRequestDTO.getCity())
            .number(addressRequestDTO.getNumber())
            .complement(addressRequestDTO.getComplement())
            .build();
    }
}
