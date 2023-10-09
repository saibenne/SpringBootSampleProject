package com.ProjectApplication.Project.Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppService {
    @Autowired
    public AppRepository apre;

    public AppliName create(AppliName api)
    {
        return apre.save(api);
    }

    public List<AppliName> getAll()
    {
        return apre.findAll();
    }

    public Optional<AppliName> getById(String id)
    {
        return apre.findById(id);
    }

    public AppliName update(String id,AppliName api)
    {
        api.setId(id);
        return apre.save(api);
    }

    public String delete(String id)
    {
        apre.deleteById(id);
        return "App with id:" + id + "deleted successfully.";
    }

}
