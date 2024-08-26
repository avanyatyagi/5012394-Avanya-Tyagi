package com.example.EmployeeManagementSystem.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Formula;
import org.hibernate.annotations.Type;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@Entity
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
@Table(name = "employees")

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Formula("(SELECT COUNT(*) FROM project p WHERE p.employee_id = id)")
    private int projectCount;


}
