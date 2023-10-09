package com.ProjectApplication.Project.Products;

import com.ProjectApplication.Project.Devices.Devices;
import com.ProjectApplication.Project.Devices.DevicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public String addProduct(Product product)
    {
        productRepository.save(product);
        return product.getProductName()+" is added successfully";
    }
    public Optional<Product> getProductByCompanyNameAndType(String name,String type)
    {
        return productRepository.findByCompanyNameAndType(name,type);
    }
    public String deleteProductById(String id)
    {
        productRepository.deleteById(id);
        return id+" deleted successfully";
    }
}
