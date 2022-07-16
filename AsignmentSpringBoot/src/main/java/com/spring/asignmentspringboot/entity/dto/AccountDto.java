package com.spring.asignmentspringboot.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {
    private int id;
    private String username;
    private String password;
    private String fullName;
    private int status;
}
