package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.dto.EmployeeDTO;
import com.example.EmployeeManagementSystem.entity.Employee;
import com.example.EmployeeManagementSystem.projection.EmployeeNameAndDepartmentProjection;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.NonNullApi;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByDepartmentName(@Param("departmentName") String departmentName);

    List<Employee> findByEmailLike(@Param("email") String email);

    @Query("SELECT e FROM Employee e WHERE LOWER(e.name) LIKE LOWER(CONCAT('%', :name, '%'))")
    List<Employee> searchByName(@Param("name") String name);

    Page<Employee> findAll(Pageable pageable);

    @Query("SELECT e FROM Employee e WHERE e.department.name = :departmentName")
    List<Employee> findByDepartmentName(String departmentName, Sort sort);

    @Query("SELECT e.name AS name, d.name AS departmentName FROM Employee e JOIN e.department d")
    List<EmployeeNameAndDepartmentProjection> findEmployeeNameAndDepartment();

    @Query("SELECT new com.example.EmployeeManagementSystem.dto.EmployeeDTO(e.name, d.name) FROM Employee e JOIN e.department d")
    List<EmployeeDTO> findEmployeeDTO();

}
