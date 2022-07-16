package com.spring.asignmentspringboot.seeder;

import com.spring.asignmentspringboot.entity.Category;
import com.spring.asignmentspringboot.repository.CategoryRepository;
import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Component
@Slf4j
public class CategorySeeder {
    private static final int NUMBER_CATEGORY = 10;
    public static List<Category> categories;
    @Autowired
    CategoryRepository categoryRepository;
    public void generate(){
        log.debug("=============START SEEDING CATEGORY============");
        Faker faker = new Faker();
        categories = new ArrayList<>();
        for (int i = 0; i < NUMBER_CATEGORY; i++) {
            categories.add(Category.builder()
                    .id(UUID.randomUUID().toString())
                    .name(faker.cat().name())
                    .build());
        }
        categoryRepository.saveAll(categories);
        log.debug("=============END OF SEEDING CATEGORY============");
    }
}
