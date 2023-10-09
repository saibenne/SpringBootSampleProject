package com.ProjectApplication.Project.Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AppController {
    @Autowired
    public AppService aps;

    @PostMapping("/app")
    public AppliName createApp(@Validated @RequestBody AppliName api)
    {
        return aps.create(api);
    }

    @GetMapping("/apps")
    public List<AppliName> getAllApps()
    {
        return aps.getAll();
    }

    @GetMapping("/app/{id}")
    public Optional<AppliName> getAppById(@PathVariable String id)
    {
        return aps.getById(id);
    }

    @PutMapping("/app/{id}")
    public AppliName updateApp(@PathVariable String id, @Validated @RequestBody AppliName api)
    {
        return aps.update(id,api);
    }

    @DeleteMapping("/app/{id}")
    public String deleteApp(@PathVariable String id)
    {
        aps.delete(id);
        return "App with id:" + id + "deleted successfully.";
    }

}
