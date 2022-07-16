package com.spring.asignmentspringboot.api;

import com.spring.asignmentspringboot.entity.Category;
import com.spring.asignmentspringboot.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(value = "*")
@RestController
@RequestMapping("api/v1/categories")
public class CategoryApi {
    @Autowired
    private CategoryRepository categoryRepository;
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Iterable<Category>> getList() {
        return ResponseEntity.ok(categoryRepository.findAll());
    }
}
