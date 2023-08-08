package com.example.bond.controller;

import com.example.bond.entities.Book;
import com.example.bond.entities.User;
import com.example.bond.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }

    @GetMapping("allUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/checkUserExist")
    public boolean checkUserExist(@RequestBody User user) {
        return userService.checkUserExist(user);
    }


    @PostMapping("/find")
    @ResponseBody
    public User findUser(@RequestBody User newUser){
        User user=userService.findUser(newUser);
        return user;
    }

    @PostMapping("/save")
    public User saveUser(@RequestBody User user) {
        if(checkUserExist(user)==true){
            return user;
        }
        System.out.println(user);
        return userService.saveUser(user);
    }
}
