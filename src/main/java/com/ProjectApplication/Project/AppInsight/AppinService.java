package com.ProjectApplication.Project.AppInsight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppinService {
    @Autowired
    public AppinRepository aire;

    public AppinName create(AppinName apn)
    {
        return aire.save(apn);
    }

    public List<AppinName> getAll()
    {
        return aire.findAll();
    }

    public Optional<AppinName> getById(String id)
    {
        return aire.findById(id);
    }

    public AppinName update(String id,AppinName apn)
    {
        apn.setId(id);
        return aire.save(apn);
    }

    public String delete(String id)
    {
        aire.deleteById(id);
        return "Client with id:" + id + "deleted successfully.";
    }
}
