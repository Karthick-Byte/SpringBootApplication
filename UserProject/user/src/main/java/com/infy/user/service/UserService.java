package com.infy.user.service;


import com.infy.user.DTO.UserDTO;
import com.infy.user.DTO.UserResponseDTO;
import com.infy.user.entity.User;
import com.infy.user.kafka.UserEvent;
import com.infy.user.kafka.UserKafkaProducer;
import com.infy.user.repository.UserRepo;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private UserKafkaProducer userKafkaProducer;

    public List<UserResponseDTO> getAllUser()
    {
        List<User> userList = userRepo.findAll();
        List<UserResponseDTO> responseList = userList.stream()
                .map(us -> modelMapper.map(us, UserResponseDTO.class))
                .collect(Collectors.toList());

        return responseList;
    }

    public UserResponseDTO fetchById(Integer id)
    {
        Optional<User> optAdd = userRepo.findById(id);
        if(optAdd.isEmpty())
        {
            throw new RuntimeException("User is not found");
        }
        User add = optAdd.get();
        return modelMapper.map(add, UserResponseDTO.class);
    }

    public UserResponseDTO createUser(UserDTO dto) {
        User optUser = modelMapper.map(dto, User.class);
        optUser.setId(null);
        User savedUser = userRepo.save(optUser);

        //Create kafka event
        UserEvent event = new UserEvent();
        event.setEventType("CREATE");
        event.setUserId(savedUser.getId());
        event.setName(savedUser.getFirstName());
        event.setEmail(savedUser.getEmail());

        //Send kafka event
        userKafkaProducer.sendUserEvent(event);

        return modelMapper.map(savedUser, UserResponseDTO.class);
    }

    public UserResponseDTO updateUser(Integer addressId, UserDTO dto) {
        User existingAddress = userRepo.findById(addressId)
                .orElseThrow(() -> new RuntimeException("User not found"));
        modelMapper.map(dto, existingAddress);
        User updatedUser = userRepo.save(existingAddress);
        return modelMapper.map(updatedUser, UserResponseDTO.class);
    }


    public UserResponseDTO deleteUser(Integer id) {
        User us = userRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        UserResponseDTO response = modelMapper.map(us, UserResponseDTO.class);
        userRepo.delete(us);
        return response;
    }

}
