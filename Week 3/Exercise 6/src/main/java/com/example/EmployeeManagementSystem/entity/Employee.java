package com.example.EmployeeManagementSystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employees")
@NamedQueries({
        @NamedQuery(
                name = "Employee.findByDepartmentName",
                query = "SELECT e FROM Employee e WHERE e.department.name = :departmentName"
        ),
        @NamedQuery(
                name = "Employee.findByEmailLike",
                query = "SELECT e FROM Employee e WHERE e.email LIKE :email"
        )
})
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;
}
