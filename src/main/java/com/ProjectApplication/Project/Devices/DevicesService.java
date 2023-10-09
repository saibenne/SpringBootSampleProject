package com.ProjectApplication.Project.Devices;

import com.ProjectApplication.Project.Company.Company;
import com.ProjectApplication.Project.Products.Product;
import com.ProjectApplication.Project.Products.ProductRepository;
import com.ProjectApplication.Project.Products.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@org.springframework.stereotype.Service
public class DevicesService {
    @Autowired
    DevicesRepository devicesRepository;
    @Autowired
    ProductService productService;
    public String addDevice(Devices devices)
    {
        devicesRepository.save(devices);
        return devices.getCompanyName()+" is added successfully";
    }
    public List<Devices> getDevicesByCompany(String name)
    {
        List<Devices> devices=devicesRepository.findByCompanyName(name).stream().toList();
        Optional<Product> tabs=productService.getProductByCompanyNameAndType(name,"tab");
        Optional<Product> mobiles=productService.getProductByCompanyNameAndType(name,"mobile");
        if(devices.size()>0) {
            devices.get(0).setTabCount(tabs.stream().toList().size());
            devices.get(0).setMobileCount(mobiles.stream().toList().size());
            devices.get(0).setTabs(tabs);
            devices.get(0).setMobiles(mobiles);
        }
        return devices;

    }
    public String deleteDevicesByCompany(String name)
    {
        devicesRepository.deleteById(name);
        return name+" deleted successfully";
    }
}
