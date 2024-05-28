package com.example.restapi_sqlserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restapi_sqlserver.model.User;
import com.example.restapi_sqlserver.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUserByIUser(Long id){
        return userRepository.findById(id).orElse(null);
    }

    public User creatUser(User user){
        return userRepository.save(user);
    }

    public User updataUser(Long id, User userDetails){
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            user.setName(userDetails.getName());
            user.setEmail(userDetails.getEmail());
        }
        return null;
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}
