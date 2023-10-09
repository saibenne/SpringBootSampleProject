package com.ProjectApplication.Project.Devices;

import com.ProjectApplication.Project.Company.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface DevicesRepository extends MongoRepository<Devices,String> {
    Optional<Devices> findByCompanyName(String name);
}
