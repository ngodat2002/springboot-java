package com.spring.asignmentspringboot.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminApi {
    @RequestMapping
    public String getAdmin() {
        return "Admin";
    }
}
