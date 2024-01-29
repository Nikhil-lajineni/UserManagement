package com.scaler.usermgmt.Service;

import com.scaler.usermgmt.Model.User;
import com.scaler.usermgmt.Repositories.GeoLocationRepository;
import com.scaler.usermgmt.Repositories.NameRepository;
import com.scaler.usermgmt.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl  implements UserService{
    private UserRepository userRepository;
    private NameRepository nameRepository;
    private GeoLocationRepository geoLocationRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, NameRepository nameRepository, GeoLocationRepository geoLocationRepository) {
        this.userRepository = userRepository;
        this.nameRepository = nameRepository;
        this.geoLocationRepository = geoLocationRepository;
    }

    @Override
    public String login(String name, String password) {
        String s="124";
        return s+" "+ name+ " "+ password;
    }

    @Override
    public User getUser(Long id) {
        Optional<User> userOptional=userRepository.findById(id);
        if(userOptional.isEmpty()){
            return null;//later will write exception
        }
        User user=userOptional.get();
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<User> getLimitedUsers(Long limit) {
        return userRepository.findLimitedUsers(limit);
    }

    @Override
    public List<User> getSortedUsers(String sortType) {
        return userRepository.findUsersAndSortById(sortType);
    }

    @Override
    public User addNewUser(User user) {
        userRepository.save(user);
        return user;
    }

    @Override
    public User updateUser(User user) {
        User user2=userRepository.save(user);
        return null;
    }

    @Override
    public User deleteUser(Long id) {
        Optional<User> deletedUser=userRepository.findById(id);
        if(deletedUser.isEmpty()){
            return null;//exception later will be written
        }
        return deletedUser.get();
    }
}
