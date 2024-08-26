package com.example.EmployeeManagementSystem.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmployeeDTO {

    private String name;
    private String departmentName;

    public EmployeeDTO(String name, String departmentName) {
        this.name = name;
        this.departmentName = departmentName;
    }

}
