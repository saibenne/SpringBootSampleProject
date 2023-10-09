package com.ProjectApplication.Project.Company;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Company {
    @Id
    String id;
    String name;
    @Transient
    Object devices;


}
