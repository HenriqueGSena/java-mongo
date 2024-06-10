package com.projetomongo.db.service;

import com.projetomongo.db.api.convert.UserConverter;
import com.projetomongo.db.api.convert.UserMapper;
import com.projetomongo.db.api.request.UserRequestDTO;
import com.projetomongo.db.api.response.UserResponseDTO;
import com.projetomongo.db.entity.Address;
import com.projetomongo.db.entity.User;
import com.projetomongo.db.exceptions.DbException;
import com.projetomongo.db.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static org.springframework.util.Assert.notNull;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    private final UserConverter userConverter;

    private final UserMapper userMapper;

    private final AddressService addressService;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public UserResponseDTO saveUsers(UserRequestDTO userRequestDTO) {
        try {
            notNull(userRequestDTO, "Os dados do usuário são obrigatórios");
            User user = saveUser(userConverter.toEntity(userRequestDTO));
            Address address = addressService.saveAddress(userConverter.toAddress(userRequestDTO.getAddress(), user.getId()));
            return userMapper.toUser(user, address);
        } catch (Exception e) {
            throw new DbException("Erro ao gravar dados de usuário", e);
        }
    }

    public UserResponseDTO searchDataUser(String email) {
        try {
            User user = userRepository.findByEmail(email);
            notNull(user, "Usuário não encontrado");
            Address address = addressService.findByUserId(user.getId());

            return userMapper.toUser(user, address);
        } catch (Exception e) {
            throw new DbException("Erro ao buscar dados de usuário", e);
        }
    }

    public void deleteDataUser(String email) {
        User userEntity = userRepository.findByEmail(email);
        userRepository.deleteByEmail(email);
        addressService.deleteByUserId(userEntity.getId());
    }
}
