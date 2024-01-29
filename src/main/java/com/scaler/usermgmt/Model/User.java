package com.scaler.usermgmt.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class User extends BaseModel{

    private String email;
    private String userName;
    private String password;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Name name;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Address address;
    private String phone;
}
