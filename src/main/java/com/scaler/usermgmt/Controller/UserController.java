package com.scaler.usermgmt.Controller;

import com.scaler.usermgmt.Dto.Login;
import com.scaler.usermgmt.Model.User;
import com.scaler.usermgmt.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    private UserService userService;
    @Autowired
    UserController(UserService userService){
        this.userService=userService;
    }
    @GetMapping(value = "/login")
    public String login(@RequestBody Login login){
       return userService.login(login.getName(),login.getPassword());
    }

    @GetMapping(value = "/get/{id}")
    public User getUser(@PathVariable Long id){
        return userService.getUser(id);
    }

    @GetMapping(value = "/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping(value = "limit/{limit}")
    public List<User> getLimitedUsers(@PathVariable Long limit){
        return userService.getLimitedUsers(limit);
    }
    @GetMapping(value = "/sort/{sortType}")
    public List<User> getSortedUsers(@PathVariable String sortType){
        return userService.getSortedUsers(sortType);
    }
    @PostMapping(value = "/add")
    public ResponseEntity<User> addNewUser(@RequestBody User user){
        User newUser=userService.addNewUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.OK);
    }
    @PutMapping(value = "update")
    public ResponseEntity<User> updateUser(@RequestBody User user){
        return new ResponseEntity<>(user,HttpStatus.OK);
    }
    @DeleteMapping(value = "delete/{id}")
    public User deletedUser(@PathVariable Long id) {
        return userService.deleteUser(id);
    }

}
