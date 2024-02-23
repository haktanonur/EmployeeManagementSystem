package com.onurhaktan.emsbackend.mapper;

import com.onurhaktan.emsbackend.dto.EmployeeDto;
import com.onurhaktan.emsbackend.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto(Employee employee){

        Long departmentId = null;
        if (employee.getDepartment() != null) {
            departmentId = employee.getDepartment().getId();
        }

        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail(),
                departmentId
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        Employee employee =  new Employee();
        employee.setId(employeeDto.getId());
        employee.setFirstName(employeeDto.getFirstName());
        employee.setLastName(employeeDto.getLastName());
        employee.setEmail(employeeDto.getEmail());
        return employee;
    }

}
