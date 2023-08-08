package com.example.bond.service;

import com.example.bond.entities.User;
import com.example.bond.repository.UserDal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDal userDal;

    @Transactional
    public User getUserById(Integer id){
        return userDal.getUserById(id);
    }

    @Transactional
    public List<User> getAllUsers() {
        return userDal.getAllUsers();
    }

    @Transactional
    public boolean checkUserExist(User user) {
        return userDal.checkUserExist(user);
    }

    @Transactional
    public User findUser(User newUser){
        return userDal.findUser(newUser);
    }

    @Transactional
    public User saveUser(User user) {
        return userDal.saveUser(user);
    }
}