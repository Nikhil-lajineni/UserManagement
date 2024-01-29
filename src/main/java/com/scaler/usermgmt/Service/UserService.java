package com.scaler.usermgmt.Service;

import com.scaler.usermgmt.Model.User;

import java.util.List;
import java.util.Optional;


public interface UserService {


    public User getUser(Long id);

    public List<User> getAllUsers();

    public List<User> getLimitedUsers(Long limit);

    public List<User> getSortedUsers(String sortType);

    public User addNewUser(User user);

    public User updateUser(User user);

    public User deleteUser(Long id);
}
