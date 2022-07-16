package com.spring.asignmentspringboot.repository;

import com.spring.asignmentspringboot.entity.Product;
import com.spring.asignmentspringboot.entity.myenum.ProductStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
    Page<Product> findAllByStatusEquals(ProductStatus status, Pageable pageable);
}
