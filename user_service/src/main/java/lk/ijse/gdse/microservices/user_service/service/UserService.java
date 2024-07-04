package lk.ijse.gdse.microservices.user_service.service;

import lk.ijse.gdse.microservices.user_service.dto.UserDTO;

import java.util.List;

public interface UserService {

    List<UserDTO> getAllUser();
    void registerUser(UserDTO userDTO);
    void updateUser(UserDTO userDTO);
}
