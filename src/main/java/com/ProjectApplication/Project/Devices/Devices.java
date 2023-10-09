package com.ProjectApplication.Project.Devices;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Devices {
    @Id
    String id;
    String companyName;
    int tabCount;
    @Transient
    Object tabs;
    int mobileCount;
    @Transient
    Object mobiles;
}
