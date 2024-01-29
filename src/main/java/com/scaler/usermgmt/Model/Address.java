package com.scaler.usermgmt.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Address extends BaseModel{
    private String city;
    private String street;
    private Long number;
    private String zipcode;
    @OneToMany(mappedBy = "address",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<User> user;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private GeoLocation geolocation;
}
