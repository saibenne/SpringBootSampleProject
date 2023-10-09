package com.ProjectApplication.Project.Application;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class AppliName {
    @Id
    public String id;

    private String appNum;
    private String appName;
    private String appType;
}
