package com.spring.asignmentspringboot.seeder;

import com.github.javafaker.Faker;
import com.spring.asignmentspringboot.entity.Category;
import com.spring.asignmentspringboot.entity.Product;
import com.spring.asignmentspringboot.entity.myenum.ProductStatus;
import com.spring.asignmentspringboot.repository.ProductRepository;
import com.spring.asignmentspringboot.uti.NumberUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Component
@Slf4j
public class ProductSeeder {
    private static final int NUMBER_OF_PRODUCT =100;
    public static List<Product> products;
    @Autowired
    ProductRepository productRepository;
    public void generate() {
        log.debug("------------Seeding product-------------");
        Faker faker = new Faker();
        products = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_PRODUCT; i++) {
            Product product = new Product();
            int randomCategoryIndex = NumberUtil.getRandomNumber(0, CategorySeeder.categories.size() - 1);
            Category category = CategorySeeder.categories.get(randomCategoryIndex);
            product.setId(UUID.randomUUID().toString());
            product.setName(faker.name().name());
            product.setDescription(faker.lorem().sentence());
            product.setPrice(new BigDecimal(NumberUtil.getRandomNumber(100,1000)*1000));
            product.setThumbNails(faker.avatar().image());
            product.setStatus(ProductStatus.ACTIVE);
            product.setCategory(category);
            products.add(product);
        }
        productRepository.saveAll(products);
        log.debug("--------------End of seeding product-------------");
    }
}
