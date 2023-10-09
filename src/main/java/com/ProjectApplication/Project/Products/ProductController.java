package com.ProjectApplication.Project.Products;

import com.ProjectApplication.Project.Devices.Devices;
import com.ProjectApplication.Project.Devices.DevicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/addProduct")
    public String addProduct(@RequestBody Product product){return productService.addProduct(product);}

    @GetMapping("/getProductByCompanyNameAndType/{name}/{type}")
    public Optional<Product> getProductByCompanyNameAndType(@PathVariable("name") String name,@PathVariable("type") String type){return productService.getProductByCompanyNameAndType(name,type);}

    @DeleteMapping("/deleteProductById/{id}")
    public String deleteProductById(@PathVariable("id") String id){return productService.deleteProductById(id);}

}
