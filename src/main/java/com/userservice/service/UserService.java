package com.userservice.service;

//import com.userservice.mapper.UserMapper;
import com.userservice.model.UserDetails;
//import com.userservice.repository.UserDetailsRepository;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class UserService {
    private static final List<UserDetails> userMap = new ArrayList<>();

//    @Autowired
//    UserDetailsRepository repository;

   // Static block to load dummy users
    static {
        userMap.add(new UserDetails(1, "Naresh", "Java Developer"));
        userMap.add(new UserDetails(2, "Ramesh", "Spring Boot Developer"));
        userMap.add(new UserDetails(3, "Suresh", "DevOps Engineer"));
    }

    public List<UserDetails> getAllUsers() {
        /*return repository.findAll()
                .stream()
                .map(UserMapper::toDto)
                .collect(Collectors.toList());*/
        return userMap;
    }

    public UserDetails getUserById(Integer id) {
        /*com.userservice.DTO.UserDetails entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return UserMapper.toDto(entity);*/
        return userMap.get(id);
    }
    public UserDetails saveUserDetails(UserDetails userDetails){
        /*com.userservice.DTO.UserDetails  entity = UserMapper.toEntity(userDetails);
        return UserMapper.toDto(repository.save(entity));*/
        userMap.add(userDetails);
        return new UserDetails();
    }
}
