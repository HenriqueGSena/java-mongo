package com.projetomongo.db.service;

import com.projetomongo.db.entity.Address;
import com.projetomongo.db.repository.AdressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressService {

    private final AdressRepository adressRepository;

    public Address saveAddress(Address address) {
        return adressRepository.save(address);
    }

    public Address findByUserId(String userId) {
        return adressRepository.findByUserId(userId);
    }

    public void deleteByUserId(String userId) {
        adressRepository.deleteByUserId(userId);
    }
}
