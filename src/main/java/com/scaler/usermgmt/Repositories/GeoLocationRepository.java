package com.scaler.usermgmt.Repositories;

import com.scaler.usermgmt.Model.GeoLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeoLocationRepository extends JpaRepository<GeoLocation, Long> {
}
