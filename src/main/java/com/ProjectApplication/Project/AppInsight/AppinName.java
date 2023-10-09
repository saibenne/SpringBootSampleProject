package com.ProjectApplication.Project.AppInsight;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class AppinName {

    @Id
    public String id;
    private String cliNum;
    private String cliName;
    private String cliRegion;

}

