package com.spring.asignmentspringboot.service;

import com.spring.asignmentspringboot.entity.Product;
import com.spring.asignmentspringboot.entity.myenum.ProductStatus;
import com.spring.asignmentspringboot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Page<Product> findAll(){
        return productRepository.findAllByStatusEquals(ProductStatus.ACTIVE, PageRequest.of(0, 10));
    }

    public Optional<Product> findById(String id){
        return productRepository.findById(String.valueOf(id));
    }

    public Product save(Product product){
        return productRepository.save(product);
    }

    public void deleteById(String id){
        productRepository.deleteById(id);
    }
}
