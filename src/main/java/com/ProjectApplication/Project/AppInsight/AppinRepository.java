package com.ProjectApplication.Project.AppInsight;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppinRepository extends JpaRepository<AppinName,String> {
}
