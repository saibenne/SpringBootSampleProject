package com.ProjectApplication.Project.Company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CompanyController {
    @Autowired
    CompanyService companyService;

    @PostMapping("/addCompany")
    public String addCompany(@RequestBody Company company){return companyService.addCompany(company);}

    @GetMapping("/getCompanyDetails/{name}")
    public List<Company> getCompanyDetails(@PathVariable("name") String name){return companyService.getCompanyByName(name);}

    @DeleteMapping("/deleteCompany/{name}")
    public String deleteCompany(@PathVariable("name") String name){return companyService.deleteCompany(name);}
}
