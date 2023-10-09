package com.ProjectApplication.Project.Devices;

import com.ProjectApplication.Project.Company.Company;
import com.ProjectApplication.Project.Company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DevicesController {
    @Autowired
    DevicesService devicesService;

    @PostMapping("/addDevice")
    public String addDevices(@RequestBody Devices devices){return devicesService.addDevice(devices);}

    @GetMapping("/getDevicesByCompany/{name}")
    public List<Devices> getDevicesByCompany(@PathVariable("name") String name){return devicesService.getDevicesByCompany(name);}

    @DeleteMapping("/deleteDeviceByCompany/{name}")
    public String deleteDeviceByCompany(@PathVariable("name") String name){return devicesService.deleteDevicesByCompany(name);}

}
