package com.onurhaktan.emsbackend.repository;

import com.onurhaktan.emsbackend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
