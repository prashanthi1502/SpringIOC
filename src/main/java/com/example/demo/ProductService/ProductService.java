package com.example.demo.ProductService;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private Repository productRepository;

    public void addProduct(Product product) {
        productRepository.save(product)
    }

    public List<Product> getAllProducts() {
        return  productRepository.findAll();
    }

    public List<Product> getProductsByCategory(String category) {
        return  productRepository.findByCategory(category);
    }
}