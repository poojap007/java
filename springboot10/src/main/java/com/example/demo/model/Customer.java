package com.example.demo.model;

import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Customer {

    @NotBlank(message = "{name.required}")
    @Size(min = 2, max = 30, message = "{name.size}")
    private String name;

    @NotBlank(message = "{email.required}")
    @Email(message = "{email.invalid}")
    private String email;

    @NotNull(message = "{age.required}")
    @Min(value = 18, message = "{age.min}")
    private Integer age;

    @NotBlank(message = "{gender.required}")
    private String gender;

    @NotNull(message = "{birthday.required}")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    @Pattern(regexp = "^(\\d{10}|\\d{3}-\\d{3}-\\d{4})$", message = "{phone.invalid}")
    private String phone;

    
}
