package com.scaler.usermgmt.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class GeoLocation extends BaseModel{
    private String lat;
    private String lon;
    @OneToOne(mappedBy = "geolocation",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JsonIgnore
    private Address address;
}
