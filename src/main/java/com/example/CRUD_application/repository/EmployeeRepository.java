package com.example.CRUD_application.repository;

import com.example.CRUD_application.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // CRUD
}
