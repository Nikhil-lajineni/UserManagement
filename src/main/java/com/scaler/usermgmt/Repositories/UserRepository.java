package com.scaler.usermgmt.Repositories;

import com.scaler.usermgmt.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query(value = "select  * from user limit ?",nativeQuery = true)
    public List<User> findLimitedUsers(Long limit);
    @Query(value = "select * from user order by id ",nativeQuery = true)
    public  List<User> findUsersAndSortById(String sortType);
}
