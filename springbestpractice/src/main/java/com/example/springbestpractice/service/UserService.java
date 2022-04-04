package com.example.springbestpractice.service;

import com.example.springbestpractice.dto.UserRequest;
import com.example.springbestpractice.entity.User;
import com.example.springbestpractice.exception.UserNotFoundException;
import com.example.springbestpractice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Nazim Uddin Asif
 * @version: 1.0
 */
@Service
public class UserService {
    @Autowired
    private UserRepository repository;


    public User saveUser(UserRequest userRequest) {
        User user = User.
                build(0, userRequest.getName(), userRequest.getEmail(),
                        userRequest.getMobile(), userRequest.getGender(), userRequest.getAge(), userRequest.getNationality());
        return repository.save(user);
    }

    public List<User> getALlUsers() {
        return repository.findAll();
    }


    public User getUser(int id) throws UserNotFoundException {
        User user= repository.findByUserId(id);
        if(user!=null){
            return user;
        }else{
            throw new UserNotFoundException("user not found with id : "+id);
        }
    }
}
