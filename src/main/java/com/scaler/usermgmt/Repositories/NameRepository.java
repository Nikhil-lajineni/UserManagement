package com.scaler.usermgmt.Repositories;

import com.scaler.usermgmt.Model.Name;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NameRepository extends JpaRepository<Name, Long> {
}
