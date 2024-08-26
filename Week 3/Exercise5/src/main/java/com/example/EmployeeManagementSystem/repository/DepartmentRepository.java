package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    // Find departments whose name contains a specific substring (case-insensitive)
    List<Department> findByNameContainingIgnoreCase(String name);

    // Find all departments in ascending order by name
    List<Department> findAllByOrderByNameAsc();
}
