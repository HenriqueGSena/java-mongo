package com.projetomongo.db.repository;

import com.projetomongo.db.entity.Address;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

public interface AdressRepository extends MongoRepository<Address, String> {

    Address findByUserId(String userId);

    @Transactional
    void deleteByUserId(String userId);
}
