package com.projetomongo.db.api.convert;

import com.projetomongo.db.api.response.UserResponseDTO;
import com.projetomongo.db.entity.Address;
import com.projetomongo.db.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "id", source = "user.id")
    @Mapping(target = "name", source = "user.name")
    @Mapping(target = "document", source = "user.document")
    @Mapping(target = "address", source = "address")
    UserResponseDTO toUser(User user, Address address);
}
