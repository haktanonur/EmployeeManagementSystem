package com.onurhaktan.emsbackend.repository;

import com.onurhaktan.emsbackend.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
