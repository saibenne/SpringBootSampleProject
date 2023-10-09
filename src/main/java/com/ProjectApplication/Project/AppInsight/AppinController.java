package com.ProjectApplication.Project.AppInsight;

import com.ProjectApplication.Project.Application.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class AppinController {
    @Autowired
    public AppinService ais;
    @Autowired
    public AppService aps;

    @PostMapping("/client")
    public AppinName createClient(@Validated @RequestBody AppinName apn)
    {
        return ais.create(apn);
    }

    @GetMapping("/clients")
    public List<AppinName> getAllClients()
    {
        return ais.getAll();
    }

    @GetMapping("/client/{id}")
    public List<Object> getClientById(@PathVariable String id)
    {
        List<Object> obj=new ArrayList<>();
        obj.add(ais.getById(id));
        obj.add(aps.getById(id));

        return obj;
    }

    @PutMapping("/client/{id}")
    public AppinName updateClient(@PathVariable String id, @Validated @RequestBody AppinName apn)
    {
        return ais.update(id,apn);
    }

    @DeleteMapping("/client/{id}")
    public String deleteClient(@PathVariable String id)
    {
        ais.delete(id);
        return "Client with id:" + id + "deleted successfully.";
    }

}
