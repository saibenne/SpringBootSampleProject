package com.ProjectApplication.Project.Products;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Product {
    @Id
    String productName;
    String companyName;
    String type;
}
