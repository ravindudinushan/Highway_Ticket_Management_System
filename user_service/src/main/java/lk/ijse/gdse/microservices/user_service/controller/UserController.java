package lk.ijse.gdse.microservices.user_service.controller;

import lk.ijse.gdse.microservices.user_service.dto.UserDTO;
import lk.ijse.gdse.microservices.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@EnableDiscoveryClient
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UserDTO> getUsers() {
        return userService.getAllUser();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void registerUser(@RequestBody UserDTO userDTO) {
        userService.registerUser(userDTO);
    }

    @PatchMapping
    public void updateUser(@RequestBody UserDTO userDTO) {
        userService.updateUser(userDTO);
    }

}
