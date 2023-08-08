package com.example.bond.entities;

import java.util.List;

public interface UserDal {
    List<User> getAllUsers();

    boolean checkUserExist(User user);

    public User getUserById(Integer id);

    public User findUser(User newUser);

    public User saveUser(User user);
}