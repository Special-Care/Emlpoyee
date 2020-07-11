package com.kakite.entities;

import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.NotEmpty;

@Data
public class Employee {
    @NotEmpty
    private Integer id;

    @Range(min = 18, max = 60, message = "Age must be between 18 and 60 years old")
    private Integer age;

    private String name;

    private String address;
}
