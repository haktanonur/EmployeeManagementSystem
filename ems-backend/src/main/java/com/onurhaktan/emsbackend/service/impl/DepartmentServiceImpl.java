package com.onurhaktan.emsbackend.service.impl;

import com.onurhaktan.emsbackend.dto.DepartmentDto;
import com.onurhaktan.emsbackend.entity.Department;
import com.onurhaktan.emsbackend.exception.ResourceNotFoundException;
import com.onurhaktan.emsbackend.repository.DepartmentRepository;
import com.onurhaktan.emsbackend.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import com.onurhaktan.emsbackend.mapper.DepartmentMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto createDepartment(DepartmentDto departmentDto) {

        Department department = DepartmentMapper.mapToDepartment(departmentDto);
        Department savedDepartment = departmentRepository.save(department);

        return DepartmentMapper.mapToDepartmentDto(savedDepartment);
    }

    @Override
    public DepartmentDto getDepartmentById(Long departmentId) {
        Department department = departmentRepository.findById(departmentId)
                .orElseThrow(() -> new ResourceNotFoundException("Department is not exist with given id : " + departmentId));
        return DepartmentMapper.mapToDepartmentDto(department);
    }

    @Override
    public List<DepartmentDto> getAllDepartments() {
        List<Department> departments = departmentRepository.findAll();

        return departments.stream()
                .map((department -> DepartmentMapper.mapToDepartmentDto(department)))
                .collect(Collectors.toList());
    }

    @Override
    public DepartmentDto updateDepartment(Long departmentId, DepartmentDto departmentDto) {
        Department department = departmentRepository.findById(departmentId)
                .orElseThrow(() -> new ResourceNotFoundException("Department is not exist with given id : " + departmentId));

        department.setDepartmentName(departmentDto.getDepartmentName());
        department.setDepartmentDescription(departmentDto.getDepartmentDescription());

        Department updatedDepartment = departmentRepository.save(department);

        return  DepartmentMapper.mapToDepartmentDto(updatedDepartment);
    }

    @Override
    public void deleteDepartment(Long departmentId) {
        Department department = departmentRepository.findById(departmentId)
                .orElseThrow(() -> new ResourceNotFoundException("Department is not exist with given id : " + departmentId));

        departmentRepository.deleteById(departmentId);
    }
}
