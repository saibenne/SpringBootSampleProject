package com.ProjectApplication.Project.Company;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Component
public interface CompanyRepository extends MongoRepository<Company,String> {
    Optional<Company> findByName(String name);
}
