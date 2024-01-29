package com.scaler.usermgmt.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Name extends BaseModel {
    private String firstName;
    private String lastName;
    @OneToMany(mappedBy = "name",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<User> users;

}
