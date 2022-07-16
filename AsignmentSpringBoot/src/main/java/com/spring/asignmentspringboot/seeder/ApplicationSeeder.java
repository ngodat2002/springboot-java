package com.spring.asignmentspringboot.seeder;

import com.spring.asignmentspringboot.entity.Order;
import com.spring.asignmentspringboot.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class ApplicationSeeder  implements CommandLineRunner {
    private static Logger logger = Logger.getLogger(ApplicationSeeder.class.getSimpleName());
    @Autowired
    ProductSeeder productSeeder;
    @Autowired
    CategorySeeder categorySeeder;
    @Autowired
    OrderSeeder orderSeeder;
    @Override
    public void run(String... args) throws Exception{
        logger.log(Level.SEVERE,"Start seeder");
        categorySeeder.generate();
        productSeeder.generate();
        orderSeeder.generate();
    }
}